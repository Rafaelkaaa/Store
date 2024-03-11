package ua.teamchallenge.stor.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Product extends BaseEntity {
    private String title;
    @ElementCollection(fetch = FetchType.LAZY)
    @Cascade(value = {CascadeType.ALL})
    @Column(name = "image")
    private List<String> images;
    private BigDecimal price;
    private String description;
}
