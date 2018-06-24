package com.ready.pojo;

public class MenuDish {
    private Integer menuDishId;

    private Integer menu;

    private Integer dish;

    private Integer dishMake;

    private Integer dishSold;

    public MenuDish(Integer menuDishId, Integer menu, Integer dish, Integer dishMake, Integer dishSold) {
        this.menuDishId = menuDishId;
        this.menu = menu;
        this.dish = dish;
        this.dishMake = dishMake;
        this.dishSold = dishSold;
    }

    public MenuDish() {
        super();
    }

    public Integer getMenuDishId() {
        return menuDishId;
    }

    public void setMenuDishId(Integer menuDishId) {
        this.menuDishId = menuDishId;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public Integer getDish() {
        return dish;
    }

    public void setDish(Integer dish) {
        this.dish = dish;
    }

    public Integer getDishMake() {
        return dishMake;
    }

    public void setDishMake(Integer dishMake) {
        this.dishMake = dishMake;
    }

    public Integer getDishSold() {
        return dishSold;
    }

    public void setDishSold(Integer dishSold) {
        this.dishSold = dishSold;
    }
}