package ua.teamchallenge.stor.facade.product;

import ua.teamchallenge.stor.api.dto.response.product.ProductDto;

public interface ProductPdpFacade {
    ProductDto findProductById(Long id);

}