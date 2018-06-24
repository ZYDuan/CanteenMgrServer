package com.ready.dao;

import com.ready.pojo.StudentOrder;
import java.util.List;

public interface StudentOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(StudentOrder record);

    StudentOrder selectByPrimaryKey(Integer orderId);

    List<StudentOrder> selectAll();

    int updateByPrimaryKey(StudentOrder record);
}