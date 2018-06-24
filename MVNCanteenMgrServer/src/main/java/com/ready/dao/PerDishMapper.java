package com.ready.dao;

import com.ready.pojo.PerDish;
import java.util.List;

public interface PerDishMapper {
    int deleteByPrimaryKey(Integer perId);

    int insert(PerDish record);

    PerDish selectByPrimaryKey(Integer perId);

    List<PerDish> selectAll();

    int updateByPrimaryKey(PerDish record);
}