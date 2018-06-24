package com.ready.dao;

import com.ready.pojo.OrderDish;
import java.util.List;

public interface OrderDishMapper {
    int deleteByPrimaryKey(Integer orderDishId);

    int insert(OrderDish record);

    OrderDish selectByPrimaryKey(Integer orderDishId);

    List<OrderDish> selectAll();

    int updateByPrimaryKey(OrderDish record);
}