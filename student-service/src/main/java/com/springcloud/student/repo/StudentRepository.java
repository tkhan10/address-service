/**
 * 
 */
package com.springcloud.student.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.student.modal.Student;

/**
 * @author tofekkhan
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
