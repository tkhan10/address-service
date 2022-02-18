/**
 * 
 */
package com.springcloud.student.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.springcloud.student.model.Student;
import com.springcloud.student.openfeign.SpringCloudFeignClient;
import com.springcloud.student.repository.StudentRepository;

import ch.qos.logback.classic.Logger;

import com.springcloud.student.common.CommonService;
import com.springcloud.student.conversion.*;

/**
 * @author tofekkhan
 *
 */
@Component
public class StudentService {
	
	Logger logger  = (Logger) LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	WebClient webClient;
	
	@Autowired
	CommonService commonService;
	
	@Autowired
	SpringCloudFeignClient addressFeignClient;
	
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
		
		logger.info("Inside Student getById");
		Student student = studentRepository.findById(stdId).get();
		StudentResponse studentResponse = new StudentResponse(student);
		// this should be student id
		studentResponse.setAddressResponse(commonService.getAddressById(student.getId()));
		return studentResponse;
	}
	
	
	/*public AddressResponse getAddressById(int addressId) {
		Mono<AddressResponse> addressResponse =  
				webClient.get().uri("/addresses/"+addressId)
				.retrieve().bodyToMono(AddressResponse.class);
		
		return addressResponse.block();
	}*/

}
