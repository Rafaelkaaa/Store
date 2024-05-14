package ua.com.teamchallenge.store.persistence.type;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;


@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "roles")
public class Role extends BaseEntity {

    @Column(value = "name")
    private String name;
}
