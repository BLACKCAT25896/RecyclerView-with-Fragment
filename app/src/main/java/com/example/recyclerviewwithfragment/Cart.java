package com.example.recyclerviewwithfragment;

public class Cart {
    private String cartProductName;
    private int cartProductPrice;
    private int cartProductQuantity;
    private int cartProductImage;

    public Cart(String cartProductName, int cartProductPrice, int cartProductQuantity, int cartProductImage) {
        this.cartProductName = cartProductName;
        this.cartProductPrice = cartProductPrice;
        this.cartProductQuantity = cartProductQuantity;
        this.cartProductImage = cartProductImage;
    }

    public String getCartProductName() {
        return cartProductName;
    }

    public int getCartProductPrice() {
        return cartProductPrice;
    }

    public int getCartProductQuantity() {
        return cartProductQuantity;
    }

    public int getCartProductImage() {
        return cartProductImage;
    }
}
