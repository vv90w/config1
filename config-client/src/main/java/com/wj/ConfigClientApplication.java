package com.wj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApplication {

    @Value("${address}")
    private String address;

    @Value("${name}")
    private String name;

    @GetMapping("/getConfig")
    public String getConfig() {
        return address;
    }

    @GetMapping("/getConfig1")
    public String getConfig1() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
