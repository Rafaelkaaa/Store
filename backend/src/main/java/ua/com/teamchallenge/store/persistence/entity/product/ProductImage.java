package ua.com.teamchallenge.store.persistence.entity.product;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import ua.com.teamchallenge.store.persistence.entity.BaseEntity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("product_images")
public class ProductImage extends BaseEntity {

    private String imageUrl;

    @Column("product_id")
    private Long productId;
}
