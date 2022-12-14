package com.meet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lenovo
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplication  {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
