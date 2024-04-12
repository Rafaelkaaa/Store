package ua.com.teamchallenge.store.facade.product.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.com.teamchallenge.store.facade.product.ProductFacade;
import ua.com.teamchallenge.store.persistence.entity.product.Product;
import ua.com.teamchallenge.store.persistence.entity.product.ProductImage;
import ua.com.teamchallenge.store.service.product.ProductService;

@Service
@AllArgsConstructor
public class ProductFacadeImpl implements ProductFacade {

    private ProductService productService;

    @Override
    public Mono<ProductDto> create(ProductDto productDto) {
        Product product = Product.builder()
                .title(productDto.getTitle())
                .price(productDto.getPrice())
                .description(productDto.getDescription())
                .images(productDto.getImages())
                .build();

        return productService.create(product)
                .flatMap(savedProduct -> {
                    Long productId = savedProduct.getId();

                    if (productDto.getImages() != null && !productDto.getImages().isEmpty()) {
                        Flux<ProductImage> imageFlux = Flux.fromIterable(productDto.getImages())
                                .map(imageUrl -> ProductImage.builder()
                                        .imageUrl(imageUrl)
                                        .productId(productId)
                                        .build());

                        return productService.saveProductImages(productId, imageFlux)
                                .then(Mono.just(new ProductDto(savedProduct)));
                    } else {
                        return Mono.just(new ProductDto(savedProduct));
                    }
                });
    }

}
