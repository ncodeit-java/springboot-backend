package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		System.out.println("Spring boot Application starting");
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
