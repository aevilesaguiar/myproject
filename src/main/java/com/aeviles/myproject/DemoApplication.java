package com.aeviles.myproject;

import com.aeviles.myproject.model.CategoryModel;
import com.aeviles.myproject.model.ProductModel;
import com.aeviles.myproject.repository.CategoryRepository;
import com.aeviles.myproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}





	@Override
	public void run(String... args) throws Exception {
		CategoryModel cat1 = new CategoryModel(null, "Electronics");
		CategoryModel cat2 = new CategoryModel(null, "Books");

		ProductModel p1 = new ProductModel(null, "TV", 2200.00, cat1);
		ProductModel p2 = new ProductModel(null, "Domain Driven Design", 120.00, cat2);
		ProductModel p3 = new ProductModel(null, "PS5", 2800.00, cat1);
		ProductModel p4 = new ProductModel(null, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);



	}
}
