package ua.teamchallenge.store.api.controller.open.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/open/products")
public class ProductController {

    @GetMapping
    public String test() {
        return "Product get";
    }
}
