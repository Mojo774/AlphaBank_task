package com.example.alpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class GifService {

    @Autowired
    private GifService gifService;

    @Value("${api_key}")
    private String api_key;

    public String getGif(int t){
        return "r";
    }
}
