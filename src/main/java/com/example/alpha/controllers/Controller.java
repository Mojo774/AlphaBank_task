package com.example.alpha.controllers;

import com.example.alpha.models.TypeGif;
import com.example.alpha.service.GifService;
import com.example.alpha.service.RateService;
import com.example.alpha.util.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private RateService rateService;

    @Autowired
    private GifService gifService;

    @GetMapping()
    public ResponseEntity getGif() {

        TypeGif typeGif = rateService.getTypeGif();
        String response = gifService.getGifLink(typeGif);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(response));

        return new ResponseEntity(headers, HttpStatus.SEE_OTHER);
    }

    @ExceptionHandler(Exception.class)
    private ResponseEntity handleException(Exception e) {
        return RequestHandler.getBadRequest(e);
    }

}
