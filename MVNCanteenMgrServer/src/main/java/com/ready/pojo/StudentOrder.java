package com.ready.pojo;

import java.util.Date;

public class StudentOrder {
    private Integer orderId;

    private Integer student;

    private Integer menu;

    private Integer orderCost;

    private Date orderTime;

    private Integer orderFinish;

    public StudentOrder(Integer orderId, Integer student, Integer menu, Integer orderCost, Date orderTime, Integer orderFinish) {
        this.orderId = orderId;
        this.student = student;
        this.menu = menu;
        this.orderCost = orderCost;
        this.orderTime = orderTime;
        this.orderFinish = orderFinish;
    }

    public StudentOrder() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public Integer getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(Integer orderCost) {
        this.orderCost = orderCost;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderFinish() {
        return orderFinish;
    }

    public void setOrderFinish(Integer orderFinish) {
        this.orderFinish = orderFinish;
    }
}