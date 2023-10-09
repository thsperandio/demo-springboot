package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private  final  StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudets() {
        return studentService.getStudets();
    }
    @PostMapping
    public void registerBewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
