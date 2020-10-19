package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class ReadinglistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadinglistApplication.class, args);
    }

}
