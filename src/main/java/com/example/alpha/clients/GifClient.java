package com.example.alpha.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ClF", url = "https://api.giphy.com")
public interface GifClient {

    @GetMapping("/v1/gifs/random")
    String findGif(@RequestParam("api_key") String api_key, @RequestParam("tag") String tag);

}
