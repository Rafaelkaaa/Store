package ua.teamchallenge.store.api.dto.request.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {

    String login;
    String password;
}
