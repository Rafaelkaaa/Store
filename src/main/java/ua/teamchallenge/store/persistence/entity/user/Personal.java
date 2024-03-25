package ua.teamchallenge.store.persistence.entity.user;

import org.springframework.data.relational.core.mapping.Table;
import ua.teamchallenge.store.persistence.type.RoleType;

@Table
public class Personal extends User {

    public Personal() {
        super();
        setRoleType(RoleType.PERSONAL);
    }
}
