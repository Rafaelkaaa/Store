package ua.teamchallenge.store.service.product;

import reactor.core.publisher.Flux;
import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.service.BaseService;

public interface ProductService extends BaseService<Product> {
    Product findById(Long id);

    void create(Product product);

    Flux<Product> findAll();
}
