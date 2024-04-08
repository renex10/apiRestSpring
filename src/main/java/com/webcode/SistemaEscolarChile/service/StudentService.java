package com.webcode.SistemaEscolarChile.service;

import com.webcode.SistemaEscolarChile.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student>findAll();
    Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);
}
