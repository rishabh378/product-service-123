package com.learning.productservice.controller;

import com.learning.productservice.models.Product;
import com.learning.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    public Stream<Product> getAllProducts() {
        Stream<Product> allProducts =  productService.getAllProducts();

        return allProducts;
    }

    public Stream<Product> getMedicalProduct() {
        Stream<Product> allProducts =  productService.getAllProducts();
        Stream<Product> medicalProducts = allProducts.filter(medical -> medical.getProductCategory()
                .equals(Product.ProductCategory.MEDICAL));

        return medicalProducts;
    }

    public Stream<Product> getCosmeticsProduct() {
        Stream<Product> allProducts =  productService.getAllProducts();
        Stream<Product> cosmeticsProducts = allProducts.filter(cosmetics -> cosmetics.getProductCategory()
                .equals(Product.ProductCategory.COSMETICS));

        return cosmeticsProducts;
    }

    public Stream<String> getProductById(long id) {
        Stream<Product> allProducts =  productService.getAllProducts();
        Stream<Product> product = allProducts.filter(medical -> medical.getId().equals(id));
        Stream<String> stringStream = product.map(productName -> productName.getName());

        return stringStream;
    }

}
