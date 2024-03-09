package ua.teamchallenge.stor.persistence.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Product extends BaseEntity {
    private String title;
    @ElementCollection
    private List<String> images;
    private BigDecimal prise;
    private  String description;
}
