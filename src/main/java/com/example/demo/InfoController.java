package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@RestController
@RequestMapping("/info")
@CrossOrigin(origins = "http://localhost:5173")
public class InfoController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public Map<String, Object> getInfo() {
        String apiUrl = "https://dog.ceo/api/breeds/image/random"; // API de imagens de cachorro
        return restTemplate.getForObject(apiUrl, Map.class);
    }
}
