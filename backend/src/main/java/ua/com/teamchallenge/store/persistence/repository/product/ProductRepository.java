package ua.com.teamchallenge.store.persistence.repository.product;

import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.persistence.entity.product.Product;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.persistence.repository.BaseRepository;

public interface ProductRepository extends BaseRepository<Product> {

    @Query("SELECT * FROM product_images WHERE product_id = :productId")
    Flux<ProductImage> getProductImages(Long productId);

    @Query("INSERT INTO product_images (imageUrl, product_id) VALUES (:imageUrl, :productId) RETURNING *")
    Mono<ProductImage> saveProductImage(String imageUrl, Long productId);

    @Query("INSERT INTO product_images (imageUrl, product_id) VALUES (:#{#productImage.imageUrl}, :#{#productImage.productId})")
    Mono<ProductImage> saveProductImage(ProductImage productImage);


}
