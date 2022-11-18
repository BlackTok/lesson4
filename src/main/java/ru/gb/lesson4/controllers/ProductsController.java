package ru.gb.lesson4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.lesson4.data.Product;
import ru.gb.lesson4.services.ProductsService;

import java.util.List;

@RestController
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products/add")
    public void addProduct(@RequestParam Long productId, @RequestParam String productTitle, @RequestParam Long productCost) {
        productsService.add(productId, productTitle, productCost);
    }

    @GetMapping("/products/delete")
    public void deleteProduct(@RequestParam Long productId) {
        productsService.delete(productId);
    }

    @GetMapping("/products/change")
    public void changeScore(@RequestParam Long productId, @RequestParam Integer delta) {
        productsService.changeScore(productId, delta);
    }

    @GetMapping("/products")
    public List<Product> allProducts() {
        return productsService.allProducts();
    }
}
