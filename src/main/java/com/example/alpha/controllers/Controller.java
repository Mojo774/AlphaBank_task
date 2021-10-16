package com.example.alpha.controllers;

import com.example.alpha.models.TypeGif;
import com.example.alpha.service.GifService;
import com.example.alpha.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {

    @Autowired
    private RateService rateService;

    @Autowired
    private GifService gifService;

    @GetMapping("/gif")
    public String getGif() {

        TypeGif t = rateService.getTypeGif();
        String response = gifService.getGif(t);

        //return new ResponseEntity(response, HttpStatus.OK);

        return "redirect:/" + response;
    }

}
