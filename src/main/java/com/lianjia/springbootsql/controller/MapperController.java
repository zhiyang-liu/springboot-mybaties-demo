package com.lianjia.springbootsql.controller;

import com.lianjia.springbootsql.bean.Class;
import com.lianjia.springbootsql.bean.Student;
import com.lianjia.springbootsql.mapper.ClassMapper;
import com.lianjia.springbootsql.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;

    @RequestMapping("/mapper")
    public String say(){
        /*Student student = new Student();
        student.setId(1);
        Student student1 = studentMapper.findStudentById(student);
        Class class1= new Class();
        class1.setId(1);
        Class class2 = classMapper.findClassById(class1);
        List<Student> list = class2.getStudentList();
        for(Student s:list){
            System.out.println(s.getName());
        }

        //第二种方法
        Class class3 = classMapper.findClassById1(class1);
        System.out.println(class3.getStudentList().get(1).getClassId()+
                class3.getStudentList().get(1).getName()+
                class3.getStudentList().get(1).getAaa()+
                class3.getStudentList().get(1).getId());
        return student1.getName()+" "+class2.getName();*/

        Student student = studentMapper.findStudentById1(1);
        System.out.println(student.getId()+" "+student.getName()+" "+student.getAaa()+" "+
            student.getClass11().getName());
        return "success!!!";
    }
}
