package ua.com.teamchallenge.store.persistence.repository.product;

import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import ua.com.teamchallenge.store.persistence.entity.product.Product;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.persistence.repository.BaseRepository;

public interface ProductRepository extends BaseRepository<Product> {

    @Query("SELECT * FROM product_images WHERE product_id = :productId")
    Flux<ProductImage> getProductImages(Long productId);
}
