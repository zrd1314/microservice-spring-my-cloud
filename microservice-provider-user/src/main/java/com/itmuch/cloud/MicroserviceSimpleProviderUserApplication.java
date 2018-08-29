package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class MicroserviceSimpleProviderUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
//    Scanner scanner = new Scanner(System.in);
//    String port = scanner.nextLine();
//    new SpringApplicationBuilder(MicroserviceSimpleProviderUserApplication.class).properties("server.port=" +port).run(args);
   // Lists.newArrayList();
  }
}
