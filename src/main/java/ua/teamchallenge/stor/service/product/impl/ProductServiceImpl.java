package ua.teamchallenge.stor.service.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.teamchallenge.stor.persistence.entity.Product;
import ua.teamchallenge.stor.persistence.repository.ProductRepository;
import ua.teamchallenge.stor.service.product.ProductService;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }


}
