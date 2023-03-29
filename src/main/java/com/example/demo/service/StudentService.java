package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudentInfo();

    String getStudentInfo1();

    boolean updateStudentInfo(StudentDTO param);

    boolean delStudentInfo(StudentDTO param);

    boolean insertStudentInfo(StudentDTO param);
}