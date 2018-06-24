package com.ready.serviceImpl;

import com.ready.ResponseVo.StudentResponse;
import com.ready.dao.ClassInfoMapper;
import com.ready.dao.GradeInfoMapper;
import com.ready.dao.StudentInfoMapper;
import com.ready.pojo.ClassInfo;
import com.ready.pojo.GradeInfo;
import com.ready.pojo.StudentInfo;
import com.ready.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: service about student
 * @create: 2018-06-18 20:37
 */
@Service
@Qualifier("studentServiceImpl")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Autowired
    private ClassInfoMapper classInfoMapper;

    @Autowired
    private GradeInfoMapper gradeInfoMapper;


    //获取所有的年级
    @Override
    public List<GradeInfo> getAllGrade() {
        return gradeInfoMapper.selectAll();
    }

    //获取年级的班级
    @Override
    public List<ClassInfo> getClassByGrade(Integer gradeId) {
        return classInfoMapper.selectByGrade(gradeId);
    }

    //分页获取学生信息
    @Override
    public List<StudentResponse> getStudentInfo(Integer from, Integer num) {
        return studentInfoMapper.selectPage(from, num);
    }

    //保存学生信息
    @Override
    public void saveStudentInfo(StudentInfo studentInfo) {
        studentInfoMapper.insert(studentInfo);
    }

    //判断同一班级里是否已有重复座位号的同学
    @Override
    public StudentInfo isRepeat(int classId, String stuId) {
        return studentInfoMapper.selectByClassStuId(classId, stuId);
    }

    //根据id查找学生
    @Override
    public StudentInfo findStudentById(int sId) {
        return studentInfoMapper.selectByPrimaryKey(sId);
    }

    //根据id删除学生
    @Override
    public void deleteStudentById(Integer sId) {
        studentInfoMapper.deleteByPrimaryKey(sId);
    }

    //更新学生信息
    @Override
    public void updateStudent(StudentInfo studentInfo) {
        studentInfoMapper.updateByPrimaryKey(studentInfo);
    }

    //根据班级跟年级获得classId
    @Override
    public int getClassByName(String className, String gradeName) {
        return classInfoMapper.selectByName(className, gradeName);
    }
}

