package ru.gb.lesson4.services;

import org.springframework.stereotype.Component;
import ru.gb.lesson4.data.Product;
import ru.gb.lesson4.repositories.ProductsRepository;

import java.util.List;

@Component
public class ProductsService {
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
        add(1L, "121212", 2L);
    }


    public void add(Long id, String title, Long cost) {
        productsRepository.add(new Product(id, title, cost));
    }

    public void delete(Long id) {
        productsRepository.delete(id);
    }

    public List<Product> allProducts() {
        return productsRepository.getProductList();
    }

    public void changeScore(Long productId, Integer delta) {
        Product product = productsRepository.findById(productId);
        product.setCost(product.getCost() + delta);
    }
}
