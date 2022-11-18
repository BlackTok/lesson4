package ru.gb.lesson4.repositories;

import org.springframework.stereotype.Component;
import ru.gb.lesson4.data.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    private static final List<Product> productList = new ArrayList<>();

//    public ProductsRepository() {
//        productList.add(new Product(1L, "Яблоко", 85L));
//    }

    public static List<Product> getProductList() {
        return productList;
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void delete(Long id) {
        productList.removeIf(p -> p.getId().equals(id));
    }

    public Product findById(Long id) {
        return productList.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }
}
