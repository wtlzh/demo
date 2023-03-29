package com.example.demo.mapper;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StudentMapper {
    List<Student> getStudentInfo();

    void delStudentInfo(@Param("param") StudentDTO param);

    void updateStudentInfo(@Param("param")StudentDTO param);

    void insertStudentInfo(@Param("param")StudentDTO param);
}