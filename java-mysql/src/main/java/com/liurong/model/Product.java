package com.liurong.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    private int id;
    private String productName;
    private float productPrice;

    public Product(){}

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }



}
