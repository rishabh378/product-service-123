package com.learning.productservice.service;

import com.learning.productservice.models.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Slf4j
@Service
public class ProductService {

    public void createService(Product product) {
        log.info("ProductService || createService ||  START Product {}", product);
    }

    public Stream<Product> getAllProducts() {
        Product.Review faceWashReview = Product.Review.builder().rating(4).comments("Badhiya!").build();
        Product faceWash = Product.builder().id(1100l).name("FaceWash")
                .productCategory(Product.ProductCategory.MEDICAL).review(faceWashReview).build();

        Product.Review bleachReview = Product.Review.builder().rating(1).comments("Bekar Muh dikhane layak nhi raha!").build();
        Product bleach = Product.builder().id(2100l).name("bleach")
                .productCategory(Product.ProductCategory.COSMETICS).review(bleachReview).build();

        Product.Review crocinReview = Product.Review.builder().rating(3).comments("Sardard thik ho gaya ab!").build();
        Product crocin = Product.builder().id(1101l).name("Crocin")
                .productCategory(Product.ProductCategory.MEDICAL).review(crocinReview).build();

        Product.Review eyelinerReview = Product.Review.builder().rating(5).comments("Acha hai \uD83D\uDE42 ab bhoot lagti hoon!").build();
        Product eyeliner = Product.builder().id(2101l).name("eyeliner")
                .productCategory(Product.ProductCategory.COSMETICS).review(eyelinerReview).build();

        return Stream.of(faceWash, bleach, crocin, eyeliner);
    }
}
