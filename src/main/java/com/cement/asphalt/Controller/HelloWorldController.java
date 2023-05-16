package com.cement.asphalt.Controller;

import dto.PersonDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

// Controller/HelloWorldController.java
@Tag(name = "인증", description = "인증 관련 api 입니다.")
@RestController
public class HelloWorldController {


        @GetMapping("/hello")
        public String test() {
            return "Test";
        }

        @Operation(summary = "검색 메서드", description = "현준이의 여자친구를 만들어주는 메서드")
        @PostMapping("/search")
        public String search(@RequestBody PersonDto personDto) {
            return "현준이가 사랑하는 " + personDto.getName();
        }
}
