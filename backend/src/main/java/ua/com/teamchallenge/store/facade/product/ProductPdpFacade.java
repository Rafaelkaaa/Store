package ua.com.teamchallenge.store.facade.product;

import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;

public interface ProductPdpFacade {

    Mono<ProductDto> findByProductId(Long id);
}
