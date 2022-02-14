/**
 * 
 */
package com.springcloud.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.student.model.Student;

/**
 * @author tofekkhan
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
