package ua.com.teamchallenge.store.persistence.entity.token;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;

@Data
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Table("tokens")
public class Token extends BaseEntity {

    private String token;

    public Boolean expired;

    public Long userId;

    public Token() {
        this.expired = false;
    }
}
