package ua.teamchallenge.store.api.controller.open;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/open")
public class OpenController {

    @GetMapping
    public String test() {
        return "Open get";
    }
}
