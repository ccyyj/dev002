package com.fc.dao;

import com.fc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    Student findByIdAndName(String id, String name);

    Student findByAgeAndName(Integer age, String name);

    Student findByGenderAndName(@Param("gender") String gender, @Param("name") String name);

    int insert(HashMap<Object, Object> map);

    int insertStudent(Student student);
}
