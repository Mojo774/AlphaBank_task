package com.example.alpha.service;

import com.example.alpha.clients.GifClient;
import com.example.alpha.models.TypeGif;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class GifService {

    @Autowired
    private GifClient gifClient;

    @Value("${api_key}")
    private String api_key;

    public String getGif(TypeGif typeGif){

        String json = gifClient.findGif(api_key,typeGif.toString());

        JSONObject request = new JSONObject(json);

        String result = request.getJSONObject("data").getString("url");

        return result;
    }
}
