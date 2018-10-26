package com.carolinachang.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carolinachang.vendas.repository.ClienteRepository;

@SpringBootApplication
public class AwVendasApiApplication {
	
	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(AwVendasApiApplication.class, args);
	}
	
	
}
