package com.example.recyclerviewwithfragment;

public class Product {
    private String productName;
    private String productPrice;
    private int productImage;
    private int quantity;

    public Product(String productName, String productPrice, int productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String productName, String productPrice, int productImage, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public int getProductImage() {
        return productImage;
    }
}
