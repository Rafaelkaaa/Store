package ua.teamchallenge.store.facade.product;

import ua.teamchallenge.store.api.dto.response.product.ProductDto;

public interface ProductPdpFacade {
    ProductDto findProductById(Long id);
}
