package com.ready.dao;

import com.ready.pojo.ClassInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassInfoMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(ClassInfo record);

    ClassInfo selectByPrimaryKey(Integer classId);

    List<ClassInfo> selectAll();

    int updateByPrimaryKey(ClassInfo record);

    List<ClassInfo> selectByGrade(Integer gradeId);

    int selectByName(@Param("className") String className, @Param("gradeName") String gradeName);
}