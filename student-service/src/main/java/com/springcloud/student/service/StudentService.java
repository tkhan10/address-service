/**
 * 
 */
package com.springcloud.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.springcloud.student.modal.Student;
import com.springcloud.student.repo.StudentRepository;

/**
 * @author tofekkhan
 *
 */
@Component
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;

	@Autowired
	WebClient webClient;
	
	public List<Student> getStudents() {
		//webClient.get().uri(null)
		return (List<Student>) studentRepo.findAll();
	}

}
