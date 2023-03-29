package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags="用户管理")
@RequestMapping("/student")
public class StudentController {
   @Resource
    StudentService studentService;

    @GetMapping("/getInfo")
    @ApiOperation(value = "查询测试",notes = "查询测试")
    public List<Student> getStudentInfo(){
        List<Student> studentInfo = studentService.getStudentInfo();
        return studentInfo;
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改",notes = "修改")
    @ResponseBody
    public boolean updateStudentInfo(@RequestBody StudentDTO param){
        boolean result = studentService.updateStudentInfo(param);
        return result;
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除",notes = "删除")
    @ResponseBody
    public boolean delStudentInfo(@RequestBody StudentDTO param){
        boolean result = studentService.delStudentInfo(param);
        return result;
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增",notes = "新增")
    @ResponseBody
    public boolean insertStudentInfo(@RequestBody StudentDTO param){
        boolean studentInfo = studentService.insertStudentInfo(param);
        return studentInfo;
    }

    @GetMapping("/getInfo1")
    @ApiOperation(value = "用户测试",notes = "用户测试notes")
    @ResponseBody
    public String getStudentInfo1(){
        String studentInfo = studentService.getStudentInfo1();
        return studentInfo;
    }

    @GetMapping("/hello")
    @ApiOperation(value = "测试",notes = "测试")
    @ResponseBody
    public String hello(){
        return "Hello word!";
    }
}
