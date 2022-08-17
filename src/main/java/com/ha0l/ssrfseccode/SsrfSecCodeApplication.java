package com.ha0l.ssrfseccode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ha0
 * @date 2022-0817
 */
@RestController
@SpringBootApplication
public class SsrfSecCodeApplication {

    @GetMapping("/")
    public String base() {
        return "System Up and Running!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SsrfSecCodeApplication.class, args);
    }

}
