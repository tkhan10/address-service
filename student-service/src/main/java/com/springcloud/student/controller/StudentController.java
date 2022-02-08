/**
 * 
 */
package com.springcloud.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.student.modal.Student;
import com.springcloud.student.service.StudentService;

/**
 * @author tofekkhan
 *
 */
@RestController
@RequestMapping("/student-service")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	// getStudents
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	/*
	 * // getStudentById
	 * 
	 * @GetMapping("/students/{stdId}") public List<Student>
	 * getStudentById(@PathVariable("stdId") int stdId) { return
	 * studentRepo.getStudentById(stdId); } // getStudentByName
	 * 
	 * // createStudent
	 * 
	 * @PostMapping("/students") public Student create(@RequestBody Student student)
	 * { return studentRepo.saveStudent(student);
	 * 
	 * }
	 * 
	 * //getStudentById
	 * 
	 * @DeleteMapping("/students/{stdId}") public boolean
	 * deleteStudent(@PathVariable("stdId") int stdId) { return
	 * studentRepo.deleteStudentById(stdId); }
	 */
	
	
	
	
}
