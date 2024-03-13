package ua.teamchallenge.stor.api.dto.response.product;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ProductDto {
    private Long id;
    private String title;
    private List<String> images;
    private BigDecimal price;
    private String description;
}
