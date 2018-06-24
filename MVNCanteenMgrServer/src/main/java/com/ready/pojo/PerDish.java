package com.ready.pojo;

public class PerDish {
    private Integer perId;

    private Integer menuDish;

    private Integer menuClass;

    private Integer allNum;

    private Integer leftNum;

    public PerDish(Integer perId, Integer menuDish, Integer menuClass, Integer allNum, Integer leftNum) {
        this.perId = perId;
        this.menuDish = menuDish;
        this.menuClass = menuClass;
        this.allNum = allNum;
        this.leftNum = leftNum;
    }

    public PerDish() {
        super();
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public Integer getMenuDish() {
        return menuDish;
    }

    public void setMenuDish(Integer menuDish) {
        this.menuDish = menuDish;
    }

    public Integer getMenuClass() {
        return menuClass;
    }

    public void setMenuClass(Integer menuClass) {
        this.menuClass = menuClass;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(Integer leftNum) {
        this.leftNum = leftNum;
    }
}