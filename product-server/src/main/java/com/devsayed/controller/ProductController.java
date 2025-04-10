package com.devsayed.controller;

import com.devsayed.entity.Product;
import com.devsayed.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
