package com.meet.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.meet.feign.StockServiceFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lenovo
 */
@RestController
@RequestMapping("/order")

public class OrderController {
    @Resource
    StockServiceFeign stockServiceFeign;
    @Value("${my.name}")
    String userName;

    @SentinelResource(value = "add",blockHandler = "flowBlockHandler")
    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String deduction = stockServiceFeign.deduction();
        return "订单："+deduction+"----"+userName;
    }

    public String flowBlockHandler(BlockException blockException){

        return "<html>alert(\"你好，我是一个警告框！\")<html/>";
    }
}
