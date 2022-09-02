package com.br.grupoestudo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @GetMapping
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("marcos")
    public String sayHelloMarcos() {
        return "Hello Marcos";
    }

}
