package com.mydependancies.deps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "hello word";
    }
}
