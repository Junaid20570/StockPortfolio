package com.stocks.stockanalysts1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StockAnalysts1Application {

	public static void main(String[] args) {
		SpringApplication.run(StockAnalysts1Application.class, args);
	}

}
