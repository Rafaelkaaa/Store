package ua.teamchallenge.stor.api.controller.admin;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.teamchallenge.stor.api.dto.response.product.ProductDto;
import ua.teamchallenge.stor.facade.product.ProductFacade;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/admin")
public class AdminController {
    private ProductFacade productFacade;

    @PostMapping("/product")
    public ResponseEntity creteProduct(@RequestBody ProductDto productDto) {
        productFacade.create(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
