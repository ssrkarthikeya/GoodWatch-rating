package io.icegadda.goodwatchratingsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GoodwatchRatingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodwatchRatingsServiceApplication.class, args);
	}

}
