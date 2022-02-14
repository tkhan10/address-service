/**
 * 
 */
package com.springcloud.address.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springcloud.address.model.Address;
import com.springcloud.address.service.AddressServiceImpl;
import com.springcloud.address.transfer.AddressRequest;
import com.springcloud.address.transfer.AddressResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author tofekkhan
 *
 */
@RestController
@RequestMapping("/api/address-service")
public class AddressController {
	
	@Autowired
	AddressServiceImpl addressService;
	
	@PostMapping("/addresses")
	public AddressResponse createAddress(@RequestBody AddressRequest addressRequest) {
		
		return addressService.createAddress(addressRequest);
	}
	
	@GetMapping("/addresses")
	public List<Address> getAddress() {
		
		return addressService.getAddresses();
	}
	
	@GetMapping("/addresses/{id}")
	public AddressResponse getAddressById(@PathVariable("id") int id) {
		
		return addressService.getAddresses(id);
	}

}
