package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class FrontendController {
    @GetMapping("/{path:[^\\.]*}")
    public String forward() {
        return "forward:/index.html";
    }
}
