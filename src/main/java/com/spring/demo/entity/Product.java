package com.spring.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="pid")
    private int id;
    @Column(name="product_name")
    private	String productName;
    @Column(name="product_price")
    private double productPrice;
    @Column(name="product_quantity")
    private	int quantity;
    @Column(name="product_image")
    private String productImage;
    @Column(name="product_description")
    private String productDescription;
    @Column(name="product_location")
    private String location;
    @Column(name="created_v", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createdDate;



    public Product() {
        // TODO Auto-generated constructor stub
    }

    public Product(int id, String productName, double productPrice, int quantity, String productImage, String productDescription, String location, Date createdDate) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productImage = productImage;
        this.productDescription = productDescription;
        this.location = location;
        this.createdDate = createdDate;
    }

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

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProdcuctImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProdcuctDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", productImage='" + productImage + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", location='" + location + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
