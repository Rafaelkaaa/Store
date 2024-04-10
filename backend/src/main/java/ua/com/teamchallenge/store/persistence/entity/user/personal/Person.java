package ua.com.teamchallenge.store.persistence.entity.user.personal;

import ua.com.teamchallenge.store.persistence.entity.user.User;
import ua.com.teamchallenge.store.persistence.type.RoleType;

public class Personal extends User {

    public Personal() {
        super();
        setRoleType(RoleType.PERSONAL);
    }
}
