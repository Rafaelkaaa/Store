package ua.teamchallenge.stor.api.controller.user;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.facade.product.ProductPdpFacade;
import ua.teamchallenge.stor.facade.product.ProductPlpFacade;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/user")
public class UserController {

    private ProductPdpFacade productPdpFacade;
    private ProductPlpFacade productPlpFacade;

   // get all products
    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<ProductDto> products = productPlpFacade.findAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    // get one product
    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        ProductDto productDto = productPdpFacade.findProductById(id);
        return ResponseEntity.status(HttpStatus.OK).body(productDto);
    }


}