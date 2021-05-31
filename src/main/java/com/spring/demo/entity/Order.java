package com.spring.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="oid")
    private int id;
    @Column(name="status")
    private String status;
    @Column(name="total_order")
    private String totalOrder;
    @Column(name="created_v")
    private Date createDate;

    public Order(){

    }
    public Order(int id, String status, String totalOrder, Date createDate) {
        this.id = id;
        this.status = status;
        this.totalOrder = totalOrder;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(String totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", totalOrder='" + totalOrder + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
