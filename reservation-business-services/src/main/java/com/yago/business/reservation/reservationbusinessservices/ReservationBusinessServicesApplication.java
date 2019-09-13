package com.yago.business.reservation.reservationbusinessservices;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableSwagger2
@EnableHystrixDashboard
public class ReservationBusinessServicesApplication {
  @Bean
  public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2).groupName("RoomReservation").select()
        .apis(RequestHandlerSelectors.basePackage("com.yago.business.reservation.reservationbusinessservices"))
        .paths(any()).build().apiInfo(new ApiInfo("Room Reservation Services",
            "A set of services to provide business processes for the Room and Reservations domains", "1.0.0", null,
            "Yago",null, null));
  }

  public static void main(String[] args) {
    SpringApplication.run(ReservationBusinessServicesApplication.class, args);
  }

}
