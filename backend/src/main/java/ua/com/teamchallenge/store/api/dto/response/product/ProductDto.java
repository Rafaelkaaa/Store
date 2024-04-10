package ua.com.teamchallenge.store.api.dto.response.product;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ua.com.teamchallenge.store.api.dto.response.BaseResponseDto;
import ua.com.teamchallenge.store.persistence.entity.product.Product;

import java.math.BigDecimal;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductDto extends BaseResponseDto {

    private String title;
    private List<String> images;
    private BigDecimal price;
    private String description;

    public ProductDto(Product product) {
        setId(product.getId());
        setTitle(product.getTitle());
        setImages(product.getImages());
        setPrice(product.getPrice());
        setDescription(product.getDescription());
    }
}
