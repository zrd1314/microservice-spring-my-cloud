package com.itmuch.cloud;

import com.itmuch.cloud.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//默认的LoadBalanced 使用的 轮询方式实现负载均衡 ， 可以自定义方式 来实现负载问题， 比如随机方式请求到服务
@SpringBootApplication
@EnableEurekaClient
//这里的 name 指定的是 要请求的 微服务名字 ，使用 TestConfiguration 来自定义 负载 规则
@RibbonClient(name = "microservice-provider-user",configuration = TestConfiguration.class)
public class ConsumerMovieRibbonApplication {

  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(ConsumerMovieRibbonApplication.class, args);
  }
}
