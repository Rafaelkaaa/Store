package ua.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.teamchallenge.store.facade.product.ProductPlpFacade;
import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.service.product.ProductService;
import ua.teamchallenge.store.facade.product.impl.mapper.ProductDtoMapper;

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
