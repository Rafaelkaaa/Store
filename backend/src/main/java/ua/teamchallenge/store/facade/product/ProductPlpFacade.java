package ua.teamchallenge.store.facade.product;

import ua.teamchallenge.store.api.dto.response.product.ProductDto;

import java.util.List;

public interface ProductPlpFacade {
    List<ProductDto> findAllProducts();
}
