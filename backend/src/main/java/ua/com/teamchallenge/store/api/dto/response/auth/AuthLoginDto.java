package ua.com.teamchallenge.store.api.dto.response.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthLoginDto {

    private String token;
    private String refreshToken;
}
