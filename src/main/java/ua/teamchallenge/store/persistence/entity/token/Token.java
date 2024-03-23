package ua.teamchallenge.store.persistence.entity.token;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ua.teamchallenge.store.persistence.entity.BaseEntity;
import ua.teamchallenge.store.persistence.entity.user.User;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Token extends BaseEntity {

    private String token;

    public Boolean expired;

    @ManyToOne
    public User user;

    public Token() {
        this.expired = false;
    }
}
