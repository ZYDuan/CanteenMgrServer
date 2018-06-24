package com.ready.dao;

import com.ready.pojo.DishInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishInfoMapper {
    int deleteByPrimaryKey(@Param("dishId") Integer dishId, @Param("dishName") String dishName);

    int insert(DishInfo record);

    DishInfo selectByPrimaryKey(@Param("dishId") Integer dishId, @Param("dishName") String dishName);

    List<DishInfo> selectAll();

    int updateByPrimaryKey(DishInfo record);
}