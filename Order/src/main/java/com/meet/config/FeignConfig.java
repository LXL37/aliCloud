package com.meet.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**Feign 的日志配置
 * @author lenovo
 */
//@Configuration
public class FeignConfig {


    @Bean
    public Logger.Level feignLogLevel(){
        return  Logger.Level.FULL;

    }
    @Bean
    public Request.Options feignRequestOptions(){
        return  new Request.Options();
    }
}
