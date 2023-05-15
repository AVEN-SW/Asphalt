package com.cement.asphalt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller/HelloWorldController.java
@RestController
public class HelloWorldController {

        @GetMapping("/api/hello")
        public String test() {
            return "Hello, world!";
        }
}
