package ua.teamchallenge.store.persistence.entity.token;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Table;
import ua.teamchallenge.store.persistence.entity.BaseEntity;
import ua.teamchallenge.store.persistence.entity.user.User;

@Data
@Table
@EqualsAndHashCode(callSuper = true)
public class Token extends BaseEntity {

    private String token;

    public Boolean expired;

    public User user;

    public Token() {
        this.expired = false;
    }
}
