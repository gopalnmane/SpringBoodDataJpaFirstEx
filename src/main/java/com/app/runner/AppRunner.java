package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.product.Product;
import com.app.repo.ProductRepositry;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	private ProductRepositry repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("Mobile",25.60));
		System.out.println(p.getProdId());
		repo.save(new Product("laptop",25000.60));
		repo.save(new Product("pen",25.60));
		repo.save(new Product("Notebook",65.6));
		
	
		
	}


}
