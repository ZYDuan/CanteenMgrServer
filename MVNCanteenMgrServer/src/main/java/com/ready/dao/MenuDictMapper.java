package com.ready.dao;

import com.ready.pojo.MenuDict;
import java.util.List;

public interface MenuDictMapper {
    int deleteByPrimaryKey(Integer mDictId);

    int insert(MenuDict record);

    MenuDict selectByPrimaryKey(Integer mDictId);

    List<MenuDict> selectAll();

    int updateByPrimaryKey(MenuDict record);
}