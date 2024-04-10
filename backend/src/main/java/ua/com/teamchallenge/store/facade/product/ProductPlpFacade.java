package ua.com.teamchallenge.store.facade.product;

import reactor.core.publisher.Flux;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;

public interface ProductPlpFacade {

    Flux<ProductDto> findAll();
}
