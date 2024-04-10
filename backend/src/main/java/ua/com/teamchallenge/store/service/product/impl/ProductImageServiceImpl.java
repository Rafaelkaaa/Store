package ua.com.teamchallenge.store.service.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.persistence.repository.product.ProductImageRepository;
import ua.com.teamchallenge.store.service.product.ProductImageService;

@Service
@Transactional
@AllArgsConstructor
public class ProductImageServiceImpl implements ProductImageService {

    ProductImageRepository productImageRepository;

    @Override
    public Mono<ProductImage> findById(Long id) {
        return productImageRepository.findById(id);
    }

    @Override
    public Flux<ProductImage> findAll() {
        return productImageRepository.findAll();
    }
}
