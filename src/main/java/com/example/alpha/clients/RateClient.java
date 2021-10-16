package com.example.alpha.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Cl", url = "https://openexchangerates.org/api")
public interface RateClient {

    @GetMapping("/latest.json?app_id=${app_id}")
    String findRate(String app_id);

    @GetMapping("/historical/{data}.json?app_id=${app_id}")
    String findRateData(@RequestParam("data") String data, @RequestParam("app_id") String app_id);
}
