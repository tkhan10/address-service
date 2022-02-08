/**
 * 
 */
package com.springcloud.student.conversion;

import com.springcloud.student.modal.Address;

/**
 * @author tofekkhan
 *
 */
public class StudentResponse {
	
	private int id;
	private String studentName;
	private String className;
	private Address address;
	/**
	 * @param id
	 * @param studentName
	 * @param className
	 * @param address
	 */
	public StudentResponse(int id, String studentName, String className, Address address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.className = className;
		this.address = address;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
