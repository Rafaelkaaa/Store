package ua.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.teamchallenge.store.facade.product.ProductPlpFacade;
import ua.teamchallenge.store.facade.product.impl.mapper.ProductDtoMapper;
import ua.teamchallenge.store.service.product.ProductService;

@Service
@AllArgsConstructor
public class ProductPlpFacadeImpl implements ProductPlpFacade {
    private ProductService productService;

    @Override
    public Flux<ProductDto> findAllProducts() {
        return productService.findAll().map(ProductDtoMapper::convertToDto);
    }


}
