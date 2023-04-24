package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
// container is a combination of containers and beans definition
@SpringBootApplication
@EnableSwagger2
public class FirstrestApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=
		SpringApplication.run(FirstrestApplication.class, args);
		for(String str:args) {
			System.out.println(str);
		}
		boolean found=ctxt.containsBean("productRepository");
		boolean found1=ctxt.containsBean("repo");  //or use containsBeanDefinition("repo")
		System.out.println(found);
		System.out.println(found1);
	}
	@Override
	public void run(String... args) throws Exception{
		System.out.println("fromCommandLineRunner");
		
		List<Product> products = repo.findAll();
		System.out.println(products.size());
	}
}
