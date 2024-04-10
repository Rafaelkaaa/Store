package ua.com.teamchallenge.store.persistence.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PermissionType {

    ADMIN_CREATE("admin:create"),
    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_DELETE("admin:delete"),
    PERSON_CREATE("personal:create"),
    PERSON_READ("personal:read"),
    PERSON_UPDATE("personal:update"),
    PERSON_DELETE("personal:delete");

    private final String permission;
}
