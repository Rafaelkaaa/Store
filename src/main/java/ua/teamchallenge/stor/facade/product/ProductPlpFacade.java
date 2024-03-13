package ua.teamchallenge.stor.facade.product;

import ua.teamchallenge.stor.api.dto.response.product.ProductDto;

import java.util.List;

public interface ProductPlpFacade {

    List<ProductDto> findAllProducts();

}