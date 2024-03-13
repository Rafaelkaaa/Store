package ua.teamchallenge.stor.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.facade.product.ProductPlpFacade;
import ua.teamchallenge.stor.facade.product.impl.mapper.ProductDtoMapper;
import ua.teamchallenge.stor.persistence.entity.Product;
import ua.teamchallenge.stor.service.product.ProductService;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductPlpFacadeImpl implements ProductPlpFacade {
    private ProductService productService;

    @Override
    public List<ProductDto> findAllProducts() {
        List<Product> products = productService.findAll();
        return products.stream()
                .map(ProductDtoMapper::convertToDto)
                .toList();
    }


}