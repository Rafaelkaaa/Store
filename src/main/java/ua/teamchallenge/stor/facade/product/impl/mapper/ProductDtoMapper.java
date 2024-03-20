package ua.teamchallenge.stor.facade.product.impl.mapper;

import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.persistence.entity.Product;

public class ProductDtoMapper {

    public static ProductDto convertToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .title(product.getTitle())
                .images(product.getImages())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }
}
