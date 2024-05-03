package ua.com.teamchallenge.store.api.controller.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.auth.RegisterDto;
import ua.com.teamchallenge.store.api.dto.response.auth.AuthDto;
import ua.com.teamchallenge.store.service.auth.AuthenticationService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<Mono<AuthDto>> register(@Validated  @RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(authenticationService.register(registerDto));
    }

    @PostMapping("/login")
    public ResponseEntity<Mono<AuthDto>> login(@Validated @RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(authenticationService.login(registerDto));
    }
}
