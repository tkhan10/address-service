/**
 * 
 */
package com.springcloud.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.student.conversion.StudentRequest;
import com.springcloud.student.conversion.StudentResponse;
import com.springcloud.student.model.Student;
import com.springcloud.student.service.StudentService;

/**
 * @author tofekkhan
 *
 */
@RestController
@RequestMapping("/api/student-service")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students") 
	public StudentResponse createStudent(@RequestBody StudentRequest studentRequest){ 
		return studentService.createStudent(studentRequest);
	  }
	
	@GetMapping("/students/{stdId}") 
	public StudentResponse getStudentById(@PathVariable("stdId") int stdId) { 
		return studentService.getStudentById(stdId); 
		}
	
	
	// getStudents
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}	
}
