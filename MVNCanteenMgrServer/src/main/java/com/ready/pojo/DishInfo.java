package com.ready.pojo;

public class DishInfo {
    private Integer dishId;

    private String dishName;

    private Float dishCost;

    private Integer dishKind;

    private String dishPic;

    public DishInfo(Integer dishId, String dishName, Float dishCost, Integer dishKind, String dishPic) {

        this.dishId = dishId;
        this.dishName = dishName;
        this.dishCost = dishCost;
        this.dishKind = dishKind;
        this.dishPic = dishPic;
    }

    public DishInfo() {
        super();
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public Float getDishCost() {
        return dishCost;
    }

    public void setDishCost(Float dishCost) {
        this.dishCost = dishCost;
    }

    public Integer getDishKind() {
        return dishKind;
    }

    public void setDishKind(Integer dishKind) {
        this.dishKind = dishKind;
    }

    public String getDishPic() {
        return dishPic;
    }

    public void setDishPic(String dishPic) {
        this.dishPic = dishPic == null ? null : dishPic.trim();
    }
}