package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/spring-mvc-example/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}
