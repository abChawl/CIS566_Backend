package com.hotel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.hotel.api.web.model")
public class Cis566BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cis566BackendApplication.class, args);
    }

}
