package ua.teamchallenge.store.config.security;


import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.teamchallenge.store.api.dto.request.auth.RegisterDto;
import ua.teamchallenge.store.api.dto.response.auth.AuthDto;
import ua.teamchallenge.store.persistence.entity.token.Token;
import ua.teamchallenge.store.persistence.entity.user.Personal;
import ua.teamchallenge.store.persistence.entity.user.User;
import ua.teamchallenge.store.persistence.repository.token.TokenRepository;
import ua.teamchallenge.store.persistence.repository.user.PersonalRepository;
import ua.teamchallenge.store.persistence.repository.user.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final PersonalRepository personalRepository;
    private final TokenRepository tokenRepository;
    private final UserRepository<User> userRepository;

    public AuthDto register(RegisterDto registerDto) {
        if (userRepository.existsByLogin(registerDto.getLogin())) {
            throw new RuntimeException("This email had already used");
        }
        Personal personal = new Personal();
        personal.setLogin(registerDto.getLogin());
        personal.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        personal = personalRepository.save(personal).block();
        String jwtToken = jwtService.generateToken(personal);
        Token token = new Token();
        token.setToken(jwtToken);
        token.setUser(personal);
        tokenRepository.save(token);
        return new AuthDto(jwtToken);
    }

    public AuthDto login(RegisterDto registerDto) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(registerDto.getLogin(), registerDto.getPassword()));
        var user = userRepository.findByLogin(registerDto.getLogin()).orElseThrow();
        String jwtToken = jwtService.generateToken(user);
        Token token = new Token();
        token.setToken(jwtToken);
        token.setUser(user);
        tokenRepository.save(token);
        return new AuthDto(jwtToken);
    }
}
