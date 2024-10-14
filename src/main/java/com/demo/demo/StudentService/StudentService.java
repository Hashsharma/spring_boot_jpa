package com.demo.demo.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.Entity.Student;
import com.demo.demo.Repository.StudentRepo;
import java.util.List;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveDetails(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents() {
	    return studentRepo.findAll();
	}

}
