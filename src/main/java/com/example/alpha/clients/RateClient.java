package com.example.alpha.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client_rate", url = "${service.rate.link}")
public interface RateClient {

    @GetMapping("/latest.json?app_id=${app_id}")
    String findRate(String app_id);

    @GetMapping("/historical/{data}.json?app_id=${app_id}&base=${base}")
    String findRateData(
            @RequestParam("data") String data,
            @RequestParam("app_id") String app_id,
            @RequestParam("base") String base);
}
