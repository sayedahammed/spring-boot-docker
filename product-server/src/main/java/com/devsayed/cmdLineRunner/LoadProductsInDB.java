package com.devsayed.cmdLineRunner;

import com.devsayed.entity.Product;
import com.devsayed.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@EnableJpaRepositories
@Transactional
@RequiredArgsConstructor
public class LoadProductsInDB implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new Product("101", "Powder Milk", 135.34));
        products.add(new Product("102", "Salt", 35.00));
        products.add(new Product("103", "Canola Oil", 345.20));
        products.add(new Product("104", "Olive Oil", 456.50));
        products.add(new Product("105", "Berry", 20.00));

        productRepository.saveAll(products);
        System.out.println("Loaded " + products.size() + " products");
    }
}
