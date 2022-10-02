package com.jb.app;

import com.jb.app.utils.ValidationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.http.HttpResponse;

@SpringBootApplication
@EnableScheduling
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		System.out.println("omer haya po");
		System.out.println(ValidationUtils.isValidEmail("CocaCola@CocaCola.com"));


	}

}