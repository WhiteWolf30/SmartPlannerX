package com.projectx.projectx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {

    @GetMapping("/status")
    public ResponseEntity<?> sayHello() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
