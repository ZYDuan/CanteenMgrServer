package com.ready.dao;

import com.ready.pojo.AdminAuz;
import java.util.List;

public interface AdminAuzMapper {
    int deleteByPrimaryKey(Integer auzId);

    int insert(AdminAuz record);

    AdminAuz selectByPrimaryKey(Integer auzId);

    List<AdminAuz> selectAll();

    int updateByPrimaryKey(AdminAuz record);
}