/**
 * 
 */
package com.springcloud.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.springcloud.student.model.Student;
import com.springcloud.student.openfeign.AddressFeignClient;
import com.springcloud.student.repository.StudentRepository;

import reactor.core.publisher.Mono;

import com.springcloud.student.conversion.*;

/**
 * @author tofekkhan
 *
 */
@Component
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	WebClient webClient;
	
	@Autowired
	AddressFeignClient addressFeignClient;
	
	public List<Student> getStudents() {
		//webClient.get().uri(null)
		return (List<Student>) studentRepository.findAll();
	}

	public StudentResponse createStudent(StudentRequest studentRequest) {
		Student student = new Student();
		student.setStudentName(studentRequest.getStudentName());
		student.setClassName(studentRequest.getClassName());
		studentRepository.save(student);
		return new StudentResponse(student);
	}

	public StudentResponse getStudentById(int stdId) {
		
		Student student = studentRepository.findById(stdId).get();
		StudentResponse studentResponse = new StudentResponse(student);
		// this should be student id
		studentResponse.setAddressResponse(addressFeignClient.getAddressById(student.getId()));
		return studentResponse;
	}
	
	public AddressResponse getAddressById(int addressId) {
		Mono<AddressResponse> addressResponse =  
				webClient.get().uri("/addresses/"+addressId)
				.retrieve().bodyToMono(AddressResponse.class);
		
		return addressResponse.block();
	}

}
