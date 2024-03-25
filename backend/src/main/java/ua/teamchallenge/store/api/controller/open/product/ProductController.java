package ua.teamchallenge.store.api.controller.open.product;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.teamchallenge.store.api.dto.response.product.ProductDto;
import ua.teamchallenge.store.facade.product.ProductPdpFacade;
import ua.teamchallenge.store.facade.product.ProductPlpFacade;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/open/products")
public class ProductController {

    private ProductPdpFacade productPdpFacade;
    private ProductPlpFacade productPlpFacade;

    // get all products
    @GetMapping("/products")
    public Flux<ProductDto> getProducts() {
        return productPlpFacade.findAllProducts();
    }

    // get one product
    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        ProductDto productDto = productPdpFacade.findProductById(id);
        return ResponseEntity.status(HttpStatus.OK).body(productDto);
    }

}
