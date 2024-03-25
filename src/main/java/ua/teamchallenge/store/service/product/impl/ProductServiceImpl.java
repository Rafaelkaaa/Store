package ua.teamchallenge.store.service.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.persistence.repository.ProductRepository;
import ua.teamchallenge.store.service.product.ProductService;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id)
                .switchIfEmpty(Mono.error(new IllegalArgumentException("Product with id " + id + " not found")))
                .block();
    }


    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public Flux<Product> findAll() {
        return productRepository.findAll();
    }


}
