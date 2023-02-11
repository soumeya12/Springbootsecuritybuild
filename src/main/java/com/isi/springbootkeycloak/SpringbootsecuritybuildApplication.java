package com.isi.springbootkeycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootsecuritybuildApplication {
    @GetMapping("/MESSAGE")
    public String getMessage(){
        return "hello, Welcome ";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsecuritybuildApplication.class, args);
    }

}
