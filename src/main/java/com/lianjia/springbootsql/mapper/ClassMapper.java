package com.lianjia.springbootsql.mapper;

import com.lianjia.springbootsql.bean.Class;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "classMapper")
public interface ClassMapper {
    public Class findClassById(Class class1);
    public Class findClassById1(Class class1);
}
