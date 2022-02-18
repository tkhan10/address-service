package com.springcloud.student.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.student.conversion.AddressResponse;
import com.springcloud.student.openfeign.SpringCloudFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CommonService {
	
	Logger logger = LoggerFactory.getLogger(CommonService.class);
	
	static int count = 0;
	
	@Autowired
	SpringCloudFeignClient addressFeignClient;
	
	@CircuitBreaker(name="addressService", 
			fallbackMethod="fallbackGetAddressById")
	public AddressResponse getAddressById(int addressId) {
		logger.info("count -- "+count);
		count++;
	AddressResponse addressResponse =  
			addressFeignClient.getAddressById(addressId);
	
	return addressResponse;
	}
	
	public AddressResponse fallbackGetAddressById(int addressId, Throwable th) {
		return new AddressResponse();	
		}
	

}
