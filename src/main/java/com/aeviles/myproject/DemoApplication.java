package com.aeviles.myproject;

import com.aeviles.myproject.model.CategoryModel;
import com.aeviles.myproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}





	@Override
	public void run(String... args) throws Exception {
		CategoryModel cat1 = new CategoryModel(1L, "Eletronics");
		CategoryModel cat2 = new CategoryModel(2L, "Books");

		categoryRepository.save(cat1);

		categoryRepository.save(cat2);


	}
}
