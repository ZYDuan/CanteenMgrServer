package com.ready.controller;

import com.ready.ResponseVo.StudentResponse;
import com.ready.common.CommonResponse;
import com.ready.pojo.ClassInfo;
import com.ready.pojo.GradeInfo;
import com.ready.pojo.StudentInfo;
import com.ready.service.StudentService;
import com.ready.util.CodeUtil;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: receive request about student
 * @create: 2018-06-18 20:35
 */

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentServiceImpl;


    //获取所有年级
    @RequestMapping("/getAllGrade")
    @ResponseBody
    public CommonResponse getAllGrade() {
        CommonResponse response = new CommonResponse();
        List<GradeInfo> gradeInfo = studentServiceImpl.getAllGrade();
        if (gradeInfo == null) {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg(CodeUtil.FAILE_MSG);
        } else {
            response.setStatus(CodeUtil.SUCCESS_CODE);
            response.setMsg(CodeUtil.SUCCESS_MSG);
            response.setData(gradeInfo);
        }

        return response;
    }

    //获取某个年级的班级
    @RequestMapping("/getClass")
    @ResponseBody
    public CommonResponse getClass(@RequestParam(value = "gradeId", required = true) Integer gradeId) {
        CommonResponse response = new CommonResponse();
        List<ClassInfo> classInfo = studentServiceImpl.getClassByGrade(gradeId);
        if (classInfo != null) {
            response.setStatus(CodeUtil.SUCCESS_CODE);
            response.setMsg(CodeUtil.SUCCESS_MSG);
            response.setData(classInfo);
        } else {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg(CodeUtil.FAILE_MSG);
        }
        return response;
    }

    //获取学生信息
    @RequestMapping("/")
    @ResponseBody
    public CommonResponse getStudentInfo(@RequestParam("from") Integer from,
                                         @RequestParam("to") Integer to) {
        CommonResponse response = new CommonResponse();
        if(to < from){
            return new CommonResponse(CodeUtil.FAILE_CODE, CodeUtil.FAILE_MSG);
        }
        List<StudentResponse> students = studentServiceImpl.getStudentInfo(from, to - from + 1);
        response.setData(students);
        response.setMsg(CodeUtil.SUCCESS_MSG);
        response.setStatus(CodeUtil.SUCCESS_CODE);
        return response;
    }

    //增加学生
    @RequestMapping("/addStudent")
    @ResponseBody
    public CommonResponse addStudent(@RequestBody HashMap<String, String> student){
        CommonResponse response = new CommonResponse();
        if(student.get("className") != null && student.get("grade") != null){
            int classId = studentServiceImpl.getClassByName(student.get("className"), student.get("grade"));

            //判断同一班级里是否已有重复座位号的同学
            if(studentServiceImpl.isRepeat(classId, student.get("stuId")) == null) {
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setStuClass(classId);
                studentInfo.setStuId(student.get("stuId"));
                studentInfo.setStuName(student.get("name"));
                studentServiceImpl.saveStudentInfo(studentInfo);
                response.setStatus(CodeUtil.SUCCESS_CODE);
                response.setMsg(CodeUtil.SUCCESS_MSG);
            }else {
                response.setStatus(CodeUtil.FAILE_CODE);
                response.setMsg("班级里已有重复座位号的同学");
            }
        }else {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg(CodeUtil.REQUEST_FAIL);
        }
        return response;
    }

    //修改学生
    @RequestMapping("/updateStudent/{student_id}")
    @ResponseBody
    public CommonResponse updateStudent(@PathVariable(value = "student_id") int sId,
                                        @RequestBody HashMap<String, String> student){
        CommonResponse response = new CommonResponse();
        int classId = studentServiceImpl.getClassByName(student.get("className"), student.get("grade"));
        StudentInfo studentTmp = studentServiceImpl.isRepeat(classId, student.get("stuId"));

        //判断同一班级里是否已有重复座位号的同学或者该同学不变
        if(studentTmp == null || studentTmp.getsId() == sId) {
            StudentInfo studentInfo = studentServiceImpl.findStudentById(sId);
            studentInfo.setStuClass(classId);
            studentInfo.setStuId(student.get("stuId"));
            studentInfo.setStuName(student.get("name"));
            studentServiceImpl.updateStudent(studentInfo);
            response.setStatus(CodeUtil.SUCCESS_CODE);
            response.setMsg(CodeUtil.SUCCESS_MSG);
        }else {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg("班级里已有重复座位号的同学");
        }
        return response;
    }

    //根据id删除学生
    @ResponseBody
    @RequestMapping("/deleteStudent")
    public CommonResponse deleteStudent(@RequestParam("sId") Integer sId){
        StudentInfo studentInfo = studentServiceImpl.findStudentById(sId);
        if(studentInfo == null){
            return new CommonResponse(CodeUtil.FAILE_CODE, "该学生不存在");
        }else{
            studentServiceImpl.deleteStudentById(sId);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        }
    }
}
