package ua.teamchallenge.store.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {
    private String title;
    @ElementCollection(fetch = FetchType.EAGER)
    @Cascade(value = {CascadeType.ALL})
    @Column(name = "image")
    private List<String> images;
    private BigDecimal price;
    private String description;
}
