package com.yago.reservation.service.reservationservice;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class ReservationServiceApplication {

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2).groupName("Reservations").select()
				.apis(RequestHandlerSelectors.basePackage("com.yago.reservation.service.reservationservice"))
				.paths(any()).build().apiInfo(new ApiInfo("Reservation Services",
						"A set of services to provide data access to reservations", "1.0.0", null,
						"Yago",null, null));
	}

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

}
