package ua.teamchallenge.stor.service.product;

import ua.teamchallenge.stor.persistence.entity.Product;
import ua.teamchallenge.stor.service.BaseService;

public interface ProductService extends BaseService<Product> {
    Product findById(Long id);

    void create(Product product);
}
