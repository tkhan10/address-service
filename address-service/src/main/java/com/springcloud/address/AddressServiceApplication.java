package com.springcloud.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.springcloud.address.model")
@EnableJpaRepositories("com.springcloud.address.repository")
public class AddressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
