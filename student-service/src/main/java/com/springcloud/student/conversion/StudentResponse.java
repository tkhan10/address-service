/**
 * 
 */
package com.springcloud.student.conversion;

import com.springcloud.student.model.Student;

/**
 * @author tofekkhan
 *
 */
public class StudentResponse {
	
	private int id;
	private String studentName;
	private String className;
	private AddressResponse addressResponse;
	
	public StudentResponse(Student student) {
		this.id = student.getId();
		this.studentName = student.getStudentName();
		this.className = student.getClassName();
		//this.address = address;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the addressResponse
	 */
	public AddressResponse getAddressResponse() {
		return addressResponse;
	}
	/**
	 * @param addressResponse the addressResponse to set
	 */
	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
	
}
