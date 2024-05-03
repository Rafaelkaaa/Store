package ua.com.teamchallenge.store.service.auth;

import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.auth.RegisterDto;
import ua.com.teamchallenge.store.api.dto.response.auth.AuthDto;

public interface AuthenticationService {

    Mono<AuthDto> login(RegisterDto registerDto);

    Mono<AuthDto> register(RegisterDto registerDto);


}
