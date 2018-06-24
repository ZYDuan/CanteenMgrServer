package com.ready.dao;

import com.ready.pojo.GradeInfo;
import java.util.List;

public interface GradeInfoMapper {
    int deleteByPrimaryKey(Integer gradeId);

    int insert(GradeInfo record);

    GradeInfo selectByPrimaryKey(Integer gradeId);

    List<GradeInfo> selectAll();

    int updateByPrimaryKey(GradeInfo record);
}