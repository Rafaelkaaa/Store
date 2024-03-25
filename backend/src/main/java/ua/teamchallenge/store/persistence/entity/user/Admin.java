package ua.teamchallenge.store.persistence.entity.user;

import org.springframework.data.relational.core.mapping.Table;
import ua.teamchallenge.store.persistence.type.RoleType;

@Table
public class Admin extends User {

    public Admin() {
        super();
        setRoleType(RoleType.ADMIN);
    }
}
