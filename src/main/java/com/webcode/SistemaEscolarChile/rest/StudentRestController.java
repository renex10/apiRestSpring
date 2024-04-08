package com.webcode.SistemaEscolarChile.rest;

import com.webcode.SistemaEscolarChile.entity.Student;
import com.webcode.SistemaEscolarChile.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5175") // Cambia la URL según la ubicación de tu aplicación Vue.js
public class StudentRestController {

    private final StudentService studentService;

    @Autowired
    public StudentRestController(StudentService theStudentService) {
        this.studentService = theStudentService;
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}") // Se cambió la URL para obtener un estudiante por su ID
    public Student getStudent(@PathVariable int studentId) {
        return studentService.findById(studentId);
    }

    @PostMapping("/students") // Se cambió la URL para guardar un nuevo estudiante
    public Student addStudent(@RequestBody Student theStudent) {
        theStudent.setId(0);
        return studentService.save(theStudent);
    }

    // PUT para actualización del estudiante
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student theStudent) {
        return studentService.save(theStudent);
    }

    // Método DELETE para eliminar un estudiante por su ID
    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        Student deletedStudent = studentService.findById(studentId);
        if (deletedStudent == null) {
            throw new RuntimeException("El estudiante no fue encontrado");
        } else {
            studentService.deleteById(studentId);
        }
        return "El estudiante ha sido eliminado correctamente - ID: " + studentId;
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(RuntimeException ex) {
        return ex.getMessage(); // Asegúrate de completar el mensaje de error aquí
    }
}
