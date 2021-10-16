package com.example.alpha.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Cl", url = "https://api.giphy.com")
public interface GifClient {

    @GetMapping("/v1/gifs/random?api_key=${api_key}&tag=${tag}")
    String findRate(@RequestParam("api_key") String api_key, @RequestParam("tag") String tag);
}
