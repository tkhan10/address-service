/**
 * 
 */
package com.springcloud.address.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springcloud.address.model.Address;
import com.springcloud.address.service.AddressServiceImpl;
import com.springcloud.address.transfer.AddressResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author tofekkhan
 *
 */
@RestController
@RequestMapping("/address-service")
public class AddressController {
	
	@Autowired
	AddressServiceImpl addressService;
	
	@GetMapping("/addresses")
	public List<Address> getAddress() {
		
		return addressService.getAddresses();
	}

}
