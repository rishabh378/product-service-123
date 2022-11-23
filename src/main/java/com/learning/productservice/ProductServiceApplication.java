package com.learning.productservice;

import com.learning.productservice.controller.ProductController;
import com.learning.productservice.models.Product;
import com.learning.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@RequiredArgsConstructor
//@Slf4j
@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

//	private final ProductService productService;
	private final ProductController controller;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Product.Review eyelinerReview = Product.Review.builder().rating(5).comments("Acha hai \uD83D\uDE00 ab bhoot lagti hoon!").build();
//		Product eyeliner = Product.builder().id(2101l).name("eyeliner")
//				.productCategory(Product.ProductCategory.COSMETICS).review(eyelinerReview).build();
//
//		productService.createService(eyeliner);
		controller.getAllProducts().forEach(System.out::println);
		controller.getMedicalProduct().forEach(System.out::println);
		controller.getCosmeticsProduct().forEach(System.out::println);
		controller.getProductById(1101l).forEach(System.out::println);
	}
}
