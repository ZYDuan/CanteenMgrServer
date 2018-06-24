package com.ready.service;

import com.ready.ResponseVo.StudentResponse;
import com.ready.pojo.ClassInfo;
import com.ready.pojo.GradeInfo;
import com.ready.pojo.StudentInfo;

import java.util.List;

public interface StudentService {

    //获取所有的年级
    List<GradeInfo> getAllGrade();

    //根据年级获取所有班级
    List<ClassInfo> getClassByGrade(Integer gradeId);

    //获取分页数据
    List<StudentResponse> getStudentInfo(Integer from, Integer num);

    // 根据年级跟班级获得classId
    int getClassByName(String className, String gradeName);

    //保存学生信息
    void saveStudentInfo(StudentInfo studentInfo);

    //判断同一班级里是否已有重复座位号的同学
    StudentInfo isRepeat(int classId, String stuId);

    //根据id查找学生
    StudentInfo findStudentById(int sId);

    //根据id删除学生
    void deleteStudentById(Integer sId);

    //更新学生信息
    void updateStudent(StudentInfo studentInfo);
}
