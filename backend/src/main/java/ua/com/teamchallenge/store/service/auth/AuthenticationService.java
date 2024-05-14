package ua.com.teamchallenge.store.service.auth;

import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.auth.LoginDto;
import ua.com.teamchallenge.store.api.dto.auth.RegisterDto;
import ua.com.teamchallenge.store.api.dto.response.auth.AuthDto;
import ua.com.teamchallenge.store.api.dto.response.auth.AuthLoginDto;

public interface AuthenticationService {

    Mono<AuthLoginDto> login(LoginDto loginDto);

    Mono<AuthDto> register(RegisterDto registerDto);


}
