/**
 * 
 */
package com.springcloud.student.conversion;


/**
 * @author tofekkhan
 *
 */
public class AddressResponse {
	
	private long addressId;
	private String pin;
	private String street;
	
	
	/**
	 * @return the addressId
	 */
	public long getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the city
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param city the city to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	

}
