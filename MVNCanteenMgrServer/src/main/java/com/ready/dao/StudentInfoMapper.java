package com.ready.dao;

import com.ready.ResponseVo.StudentResponse;
import com.ready.pojo.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer sId);

    List<StudentInfo> selectAll();

    int updateByPrimaryKey(StudentInfo record);

    List<StudentResponse> selectPage(@Param("offset") Integer offset, @Param("limit") Integer limit);

    StudentInfo selectByClassStuId(@Param("classId") Integer classId, @Param("stuId")String stuId);
}