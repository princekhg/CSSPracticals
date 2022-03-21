package com.css.practical;

public class Product {
    String productName,productID;
    int price;

    public Product(String productName, String productID,int price) {
        this.productName = productName;
        this.productID = productID;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
