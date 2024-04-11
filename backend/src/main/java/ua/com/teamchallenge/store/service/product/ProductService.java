package ua.com.teamchallenge.store.service.product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.product.Product;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.service.BaseService;
import ua.com.teamchallenge.store.service.FindAllService;

public interface ProductService extends BaseService<Product>, FindAllService<Product> {

    Mono<Product> create(Product product);

    Flux<ProductImage> getProductImages(Long productId);

    Mono<Void> saveProductImages(Long productId, Flux<ProductImage> productImages);

    Mono<ProductImage> saveProductImage(Long productId, String imageUrl);
}
