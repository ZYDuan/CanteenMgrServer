package com.ready.pojo;

public class OrderDish {
    private Integer orderDishId;

    private Integer orderId;

    private Integer dish;

    private Integer dishNum;

    private Integer dishCost;

    public OrderDish(Integer orderDishId, Integer orderId, Integer dish, Integer dishNum, Integer dishCost) {
        this.orderDishId = orderDishId;
        this.orderId = orderId;
        this.dish = dish;
        this.dishNum = dishNum;
        this.dishCost = dishCost;
    }

    public OrderDish() {
        super();
    }

    public Integer getOrderDishId() {
        return orderDishId;
    }

    public void setOrderDishId(Integer orderDishId) {
        this.orderDishId = orderDishId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDish() {
        return dish;
    }

    public void setDish(Integer dish) {
        this.dish = dish;
    }

    public Integer getDishNum() {
        return dishNum;
    }

    public void setDishNum(Integer dishNum) {
        this.dishNum = dishNum;
    }

    public Integer getDishCost() {
        return dishCost;
    }

    public void setDishCost(Integer dishCost) {
        this.dishCost = dishCost;
    }
}