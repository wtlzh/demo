package com.example.demo.service.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Student> getStudentInfo() {
        return studentMapper.getStudentInfo();
    }



    @Override
    public boolean updateStudentInfo(StudentDTO param){
        studentMapper.updateStudentInfo(param);
        return true;
    }

    @Override
    public boolean delStudentInfo(StudentDTO param){
        studentMapper.delStudentInfo(param);
        return true;
    }

    @Override
    public boolean insertStudentInfo(StudentDTO param){
        studentMapper.insertStudentInfo(param);
        return true;
    }

    @Override
    public String getStudentInfo1() {
        String result = testMapper.getAa();
        return result;
    }
}