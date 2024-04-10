package ua.com.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.com.teamchallenge.store.facade.product.ProductPlpFacade;
import ua.com.teamchallenge.store.service.product.ProductService;

@Service
@AllArgsConstructor
public class ProductPlpFacadeImpl implements ProductPlpFacade {

    private final ProductService productService;

    @Override
    public Flux<ProductDto> findAll() {
        return productService.findAll()
                .map(ProductDto::new);
    }}
