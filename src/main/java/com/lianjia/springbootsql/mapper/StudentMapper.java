package com.lianjia.springbootsql.mapper;

import com.lianjia.springbootsql.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "studentMapper")
public interface StudentMapper {
    public Student findStudentById(Student student);
    public Student findStudentById1(int id);
}
