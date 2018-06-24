package com.ready.service;

import com.ready.pojo.DishDict;

import java.util.List;

public interface FoodService {

    //获得所有菜品种类
    List<DishDict> findAllKind();

    //t通过种类名称获取种类
    DishDict findKindByName(String kindName);

    //增加菜品种类
    void saveFoodKind(DishDict kind);

    //修改菜品种类
    void updateFoodKind(DishDict kind);

    //根据id查看种类
    DishDict findKindById(int id);

    //删除种类
    void deleteFoodKind(int id);
}
