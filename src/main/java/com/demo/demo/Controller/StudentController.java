package com.demo.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.demo.demo.Entity.Student;
import com.demo.demo.StudentService.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add-student")
	public Student postDetails(@RequestBody Student student) {
		return studentService.saveDetails(student);
	}
	
	@GetMapping("/all-student")
	  public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
		System.out.print(students);

        return ResponseEntity.ok(students);
    }

}
