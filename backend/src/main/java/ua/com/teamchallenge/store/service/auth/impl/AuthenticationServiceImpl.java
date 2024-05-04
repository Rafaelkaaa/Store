package ua.com.teamchallenge.store.service.auth.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.auth.RegisterDto;
import ua.com.teamchallenge.store.api.dto.response.auth.AuthDto;
import ua.com.teamchallenge.store.config.security.JwtService;
import ua.com.teamchallenge.store.persistence.entity.user.User;
import ua.com.teamchallenge.store.persistence.repository.user.UserRepository;
import ua.com.teamchallenge.store.persistence.type.RoleType;
import ua.com.teamchallenge.store.service.auth.AuthenticationService;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final ReactiveAuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository<User> userRepository;

    @Override
    public Mono<AuthDto> login(RegisterDto registerDto) {
        return userRepository.findByLogin(registerDto.getLogin())
                .flatMap(user -> authenticateUser(registerDto)
                        .then(generateToken(user))
                )
                .switchIfEmpty(Mono.error(new RuntimeException("User not found")));
    }

    @Override
    public Mono<AuthDto> register(RegisterDto registerDto) {
        return userRepository.existsByLogin(registerDto.getLogin())
                .flatMap(exists -> exists ? Mono.error(new RuntimeException("This email has already been used")) : createUser(registerDto));
    }

    private Mono<Void> authenticateUser(RegisterDto registerDto) {
        return Mono.fromRunnable(() -> authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(registerDto.getLogin(), registerDto.getPassword())));
    }

    private Mono<AuthDto> generateToken(User user) {
        return jwtService.generateToken(user)
                .map(AuthDto::new);
    }

    private Mono<AuthDto> createUser(RegisterDto registerDto) {
        return Mono.just(new User())
                .doOnNext(user -> {
                    user.setLogin(registerDto.getLogin());
                    user.setRoleType(RoleType.PERSONAL);
                    user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
                })
                .flatMap(userRepository::save)
                .flatMap(this::generateToken);
    }
}
