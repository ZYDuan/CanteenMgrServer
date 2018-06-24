package com.ready.dao;

import com.ready.pojo.MenuDish;
import java.util.List;

public interface MenuDishMapper {
    int deleteByPrimaryKey(Integer menuDishId);

    int insert(MenuDish record);

    MenuDish selectByPrimaryKey(Integer menuDishId);

    List<MenuDish> selectAll();

    int updateByPrimaryKey(MenuDish record);
}