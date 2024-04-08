package com.webcode.SistemaEscolarChile.dao;

import com.webcode.SistemaEscolarChile.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    //no necesitamos escribir nada de codigo LOL!!
    //no necesita tampoco implementacion

}
