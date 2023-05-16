package com.cement.asphalt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller/HelloWorldController.java
@RestController
public class HelloWorldController {

        @GetMapping("/hello")
        public String test() {
            return "Test";
        }
}
