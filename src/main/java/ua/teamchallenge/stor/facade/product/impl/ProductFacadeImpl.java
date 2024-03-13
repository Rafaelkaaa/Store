package ua.teamchallenge.stor.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.facade.product.ProductFacade;
import ua.teamchallenge.stor.persistence.entity.Product;
import ua.teamchallenge.stor.service.product.ProductService;

@Service
@AllArgsConstructor
public class ProductFacadeImpl implements ProductFacade {
    private ProductService productService;

    public void create(ProductDto productDto) {
        productService.create(Product.builder()
                .title(productDto.getTitle())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .images(productDto.getImages())
                .build());
    }
}
