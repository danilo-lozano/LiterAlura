package com.example.literalura.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {


    private static final String BASE_URL = "https://gutendex.com/books/";


    public String searchBookByTitle(String title) {

        RestTemplate restTemplate = new RestTemplate();

        String url = BASE_URL + "?search=" + title;

        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
