package ua.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.teamchallenge.store.facade.product.ProductPdpFacade;
import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.service.product.ProductService;
import ua.teamchallenge.store.facade.product.impl.mapper.ProductDtoMapper;

@Service
@AllArgsConstructor
public class ProductPdpFacadeImpl implements ProductPdpFacade {

    private ProductService productService;

    @Override
    public ProductDto findProductById(Long id) {
        Product productById = productService.findById(id);
        return ProductDtoMapper.convertToDto(productById);
    }

}
