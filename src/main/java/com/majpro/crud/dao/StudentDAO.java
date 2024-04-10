package com.majpro.crud.dao;

import com.majpro.crud.entity.Student;

public interface StudentDAO {
    
    void save(Student theStudent);

    Student findById(Integer id);
}
