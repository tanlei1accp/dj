package com.example.csdj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.csdj.branch.mapper")
@MapperScan("com.example.csdj.committee.mapper")
public class CsdjApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsdjApplication.class, args);
    }

}
