package ua.teamchallenge.store.facade.product;

import reactor.core.publisher.Flux;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;

public interface ProductPlpFacade {
    Flux<ProductDto> findAllProducts();
}
