package ua.teamchallenge.store.service.product;

import ua.teamchallenge.store.persistence.entity.Product;
import ua.teamchallenge.store.service.BaseService;

import java.util.List;

public interface ProductService extends BaseService<Product> {
    Product findById(Long id);

    void create(Product product);

    List<Product> findAll();
}
