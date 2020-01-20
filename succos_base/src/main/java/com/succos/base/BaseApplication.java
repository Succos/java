package com.succos.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import util.IdWorker;

@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
