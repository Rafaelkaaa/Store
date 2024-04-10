package ua.com.teamchallenge.store.persistence.entity.product;

import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("products")
public class Product extends BaseEntity {

    private String title;
    private BigDecimal price;
    private String description;

    @Transient
    private List<String> images;
}
