package ua.com.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.com.teamchallenge.store.facade.product.ProductPdpFacade;
import ua.com.teamchallenge.store.service.product.ProductService;

@Service
@AllArgsConstructor
public class ProductPdpFacadeImpl implements ProductPdpFacade {

    private final ProductService productService;

    @Override
    public Mono<ProductDto> findByProductId(Long id) {
        return productService.findById(id).map(ProductDto::new);
    }
}
