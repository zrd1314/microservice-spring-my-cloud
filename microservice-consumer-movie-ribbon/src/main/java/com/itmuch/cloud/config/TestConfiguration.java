package com.itmuch.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:zrd
 * @Description:
 * @Date:2018-7-16 14:58
 */
@Configuration
public class TestConfiguration {

   @Bean
    public IRule ribbonRule(){
       return new RandomRule();
   }
}
