package com.projectx.projectx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hell")
public class Fi {

    @GetMapping("/hell")
    public String sayHello(){
        return "Hello";
    }

}
