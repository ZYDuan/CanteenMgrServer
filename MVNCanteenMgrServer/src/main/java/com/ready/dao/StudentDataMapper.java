package com.ready.dao;

import com.ready.pojo.StudentData;
import java.util.List;

public interface StudentDataMapper {
    int deleteByPrimaryKey(Integer sdId);

    int insert(StudentData record);

    StudentData selectByPrimaryKey(Integer sdId);

    List<StudentData> selectAll();

    int updateByPrimaryKey(StudentData record);
}