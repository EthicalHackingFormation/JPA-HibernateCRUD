package com.majpro.crud.dao;

import java.util.List;

import com.majpro.crud.entity.Student;

public interface StudentDAO {
    
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();
}
