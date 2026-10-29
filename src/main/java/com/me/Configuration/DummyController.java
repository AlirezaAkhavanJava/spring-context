package com.me.Configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dum")
public class DummyController {

    @GetMapping("/spiderman")
    public String greet() {
        return "I AM HOMELESS-MAN";
    }

}
