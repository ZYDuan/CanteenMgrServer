package com.ready.dao;

import com.ready.pojo.DishDict;
import java.util.List;

public interface DishDictMapper {
    int deleteByPrimaryKey(Integer kindId);

    int insert(DishDict record);

    DishDict selectByPrimaryKey(Integer kindId);

    List<DishDict> selectAll();

    int updateByPrimaryKey(DishDict record);

    DishDict selectByName(String kindName);
}