package ua.com.teamchallenge.store.persistence.entity.user.person;

import ua.com.teamchallenge.store.persistence.entity.user.User;
import ua.com.teamchallenge.store.persistence.type.RoleType;

public class Person extends User {

    public Person() {
        super();
        setRoleType(RoleType.PERSONAL);
    }
}
