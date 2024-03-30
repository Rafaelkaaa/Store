package ua.teamchallenge.store.persistence.entity.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import ua.teamchallenge.store.persistence.type.RoleType;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends User {

    public Admin() {
        super();
        setRoleType(RoleType.ADMIN);
    }
}
