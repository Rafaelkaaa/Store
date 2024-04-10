package ua.com.teamchallenge.store.api.dto.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {

    String login;
    String password;
}
