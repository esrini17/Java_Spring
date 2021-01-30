package com.cakemanager.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cakemanager.app.entities.CakeEntity;
import com.cakemanager.app.service.CakeService;

@SpringBootApplication
public class CakeManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CakeManagementAppApplication.class, args);
		
		CakeService cakeService = applicationContext.getBean("cakeService", CakeService.class);
		
		CakeEntity cake = new CakeEntity();
		cake.setTitle("Strawberry Cake");;
		cake.setDescription("This was made of delicious strawberry.");
		cake.setImage("Image");
		
		cakeService.createCake(cake);
	}
}
