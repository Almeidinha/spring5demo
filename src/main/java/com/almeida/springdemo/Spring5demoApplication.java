package com.almeida.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5demoApplication.class, args);
	}

	/*@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring5demo");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}*/

}
