package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @Value("${application.key1}")
    private String fromConfigMap;

    @Value("${application.key2}")
    private String fromSecrets;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Map<String, String> helloWorld() {
        return Map.of("from-config-map", fromConfigMap, "from-secrets", fromSecrets);
    }
}
