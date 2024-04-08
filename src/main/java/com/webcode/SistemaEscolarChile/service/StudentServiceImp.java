package com.webcode.SistemaEscolarChile.service;

import com.webcode.SistemaEscolarChile.dao.StudentRepository;
import com.webcode.SistemaEscolarChile.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements  StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImp(StudentRepository  theStudentRepository){

        studentRepository =  theStudentRepository;
    }
    @Override
    public List<Student> findAll() {

        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);
        Student theStudent = null;
        if(result.isPresent()){
            theStudent = result.get();


        }//no encontramos al studiante
        else {
            throw new RuntimeException("no encontramos al estudiante que has ingresado id " + theId);
        }
        return theStudent;
    }


    @Override
    public Student save(Student theStudent) {
        return studentRepository.save(theStudent);

    }


    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);

    }
}
