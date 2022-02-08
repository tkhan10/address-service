/**
 * 
 */
package com.springcloud.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.address.model.Address;
import com.springcloud.address.repository.AddressRepository;
//import com.springcloud.address.transfer.AddressResponse;

/**
 * @author tofekkhan
 *
 */
@Service
public class AddressServiceImpl {
	
	@Autowired
	AddressRepository addressRepo;
	
	public List<Address> getAddresses() {
		return (List<Address>) addressRepo.findAll();
	}
}
