package com.cement.asphalt.Controller;

import dto.PersonDto;
import org.springframework.web.bind.annotation.*;

// Controller/HelloWorldController.java
@RestController
public class HelloWorldController {

        @GetMapping("/hello")
        public String test() {
            return "Test";
        }

        @PostMapping("/search")
        public String search(@RequestBody PersonDto personDto) {
            return "현준이가 사랑하는 " + personDto.getName();
        }
}
