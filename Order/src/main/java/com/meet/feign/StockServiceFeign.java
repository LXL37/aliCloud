package com.meet.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lenovo
 */
@FeignClient(name = "stock-service",path = "/stock")
public interface StockServiceFeign {
    /**
     * 声明需要调用的rest接口的方法
     * @return
     */
    @RequestMapping("/deduct")
       String deduction();
}

/*
@RestController
@RequestMapping("/stock")
public class StockController {


    @RequestMapping("/deduct")
    public String deduction(){

        System.out.println("扣除库存");
        return "扣除";
    }
}
*/
