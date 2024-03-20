package ua.teamchallenge.stor.facade.product;

import ua.teamchallenge.stor.api.dto.response.product.ProductDto;

public interface ProductFacade {
    void create(ProductDto productDto);
}
