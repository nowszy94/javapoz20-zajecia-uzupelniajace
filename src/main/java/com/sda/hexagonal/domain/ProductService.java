package com.sda.hexagonal.domain;

import com.sda.hexagonal.domain.port.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(String name, String description, ProductCategory category, Double weight) {
        List<Product> productFromCategory = productRepository.findByCategory(category);
        boolean productWithSameNameExistInCategory = productFromCategory.stream()
                .filter(product -> product.getName().equals(name))
                .findAny()
                .isPresent();
//                        .anyMatch(product -> product.getName().equals(name));

        if (productWithSameNameExistInCategory) {
            throw new ProductAlreadyExistsException("Product with name " + name + " exists in category " + category);
        }

        return productRepository.save(new Product(name, description, category, weight));
    }
}
