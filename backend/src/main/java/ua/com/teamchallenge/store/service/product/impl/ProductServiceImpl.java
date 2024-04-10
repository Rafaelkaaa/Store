package ua.com.teamchallenge.store.service.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.product.Product;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.persistence.repository.product.ProductRepository;
import ua.com.teamchallenge.store.service.product.ProductService;


@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Mono<Product> findById(Long id) {
        return productRepository.findById(id);
    }


    @Override
    public Mono<Product> create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Flux<ProductImage> getProductImages(Long productId) {
        return productRepository.getProductImages(productId);
    }

    @Override
    public Flux<Product> findAll() {
        return productRepository.findAll();
    }
}
