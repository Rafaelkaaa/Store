package ua.teamchallenge.store.persistence.entity.user;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import ua.teamchallenge.store.persistence.type.RoleType;

@Entity
@DiscriminatorValue("PERSONAL")
public class Personal extends User {

    public Personal() {
        super();
        setRoleType(RoleType.PERSONAL);
    }
}
