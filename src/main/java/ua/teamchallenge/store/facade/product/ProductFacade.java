package ua.teamchallenge.store.facade.product;

import ua.teamchallenge.store.api.dto.response.product.ProductDto;

public interface ProductFacade {
    void create(ProductDto productDto);
}
