package com.ready.pojo;

import java.util.Date;

public class MenuInfo {
    private Integer menuId;

    private Date menuTime;

    private Integer menuKind;

    private Integer menuActivated;

    public MenuInfo(Integer menuId, Date menuTime, Integer menuKind, Integer menuActivated) {
        this.menuId = menuId;
        this.menuTime = menuTime;
        this.menuKind = menuKind;
        this.menuActivated = menuActivated;
    }

    public MenuInfo() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Date getMenuTime() {
        return menuTime;
    }

    public void setMenuTime(Date menuTime) {
        this.menuTime = menuTime;
    }

    public Integer getMenuKind() {
        return menuKind;
    }

    public void setMenuKind(Integer menuKind) {
        this.menuKind = menuKind;
    }

    public Integer getMenuActivated() {
        return menuActivated;
    }

    public void setMenuActivated(Integer menuActivated) {
        this.menuActivated = menuActivated;
    }
}