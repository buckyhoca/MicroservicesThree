package com.example.MicroserviceThree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceThreeApplication.class, args);
	}
}
