package com.example.alpha.controllers;

import com.example.alpha.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {

    @Autowired
    private RateService rateService;

    @GetMapping("/gif")
    public String getGif() {

        int t = rateService.differenceRate();

        return ""+t;
    }

}
