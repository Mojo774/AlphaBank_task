package com.example.alpha.service;

import com.example.alpha.clients.RateClient;
import com.example.alpha.models.TypeGif;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RateService {

    @Autowired
    private RateClient rateClient;

    @Value("${app_id}")
    private String app_id;

    public TypeGif getTypeGif() {
        LocalDate date = LocalDate.now().minusDays(1);

        return TypeGif.getType(getRate().compareTo(getRate(date)));
    }

    public Double getRate() {
        String json = rateClient.findRate(app_id);

        JSONObject request = new JSONObject(json);

        Double rate = request.getJSONObject("rates").getDouble("RUB");

        return rate;
    }

    public Double getRate(LocalDate date) {

        String json = rateClient.findRateData(date.toString(), app_id);

        JSONObject request = new JSONObject(json);

        Double rate = request.getJSONObject("rates").getDouble("RUB");

        return rate;
    }
}
