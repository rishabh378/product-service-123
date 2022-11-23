package com.learning.productservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private String name;
    private Long id;
    private ProductCategory productCategory;
    private Review review;
    public enum ProductCategory { MEDICAL,COSMETICS }

    @Data
    @Builder
    public static class Review {
        private Integer rating;
        private String comments;
    }
}
