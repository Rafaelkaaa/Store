package ua.com.teamchallenge.store.api.controller.open.product;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.com.teamchallenge.store.facade.product.ProductPdpFacade;
import ua.com.teamchallenge.store.facade.product.ProductPlpFacade;

@RestController
@RequestMapping("/api/open/products")
@AllArgsConstructor
public class ProductController {

    private final ProductPlpFacade productPlpFacade;
    private final ProductPdpFacade productPdpFacade;

    @GetMapping("/plp")
    public ResponseEntity<Flux<ProductDto>> findAll() {
        return ResponseEntity.ok(productPlpFacade.findAll());
    }

    @GetMapping("/pdp/{productId}")
    public ResponseEntity<Mono<ProductDto>> findByProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(productPdpFacade.findByProductId(productId));
    }
}
