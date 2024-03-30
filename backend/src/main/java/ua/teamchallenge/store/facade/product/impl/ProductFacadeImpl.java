package ua.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.teamchallenge.store.facade.product.ProductFacade;
import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.service.product.ProductService;

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
