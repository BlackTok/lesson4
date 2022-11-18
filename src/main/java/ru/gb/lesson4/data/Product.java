package ru.gb.lesson4.data;

public class Product {
    private Long id, cost;
    private String title;

    public Product(Long id, String title, Long cost) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
