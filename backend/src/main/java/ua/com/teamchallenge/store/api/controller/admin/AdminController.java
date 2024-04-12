package ua.com.teamchallenge.store.api.controller.admin;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.com.teamchallenge.store.facade.product.ProductFacade;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
public class AdminController {

    private final ProductFacade productFacade;

    @PostMapping("/product")
    public ResponseEntity<Mono<ProductDto>> createProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productFacade.create(productDto));
    }
}
