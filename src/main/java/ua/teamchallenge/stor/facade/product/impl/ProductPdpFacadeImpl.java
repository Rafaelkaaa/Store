package ua.teamchallenge.stor.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.facade.product.ProductPdpFacade;
import ua.teamchallenge.stor.facade.product.impl.mapper.ProductDtoMapper;
import ua.teamchallenge.stor.persistence.entity.Product;
import ua.teamchallenge.stor.service.product.ProductService;

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