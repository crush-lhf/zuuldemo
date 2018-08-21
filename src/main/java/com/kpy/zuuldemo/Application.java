package com.kpy.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务类1
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @RequestMapping("/service01")
    public String home() {
        return "你好 这是服务1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
