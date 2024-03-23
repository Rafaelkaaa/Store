package ua.teamchallenge.store.api.controller.open.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.teamchallenge.store.api.dto.request.auth.RegisterDto;
import ua.teamchallenge.store.api.dto.response.auth.AuthDto;
import ua.teamchallenge.store.config.security.AuthenticationService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthDto> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(authenticationService.register(registerDto));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthDto> login(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(authenticationService.login(registerDto));
    }
}
