/**
 * 
 */
package com.springcloud.address.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.address.model.Address;
import com.springcloud.address.repository.AddressRepository;
import com.springcloud.address.transfer.AddressRequest;
//import com.springcloud.address.transfer.AddressResponse;
import com.springcloud.address.transfer.AddressResponse;

/**
 * @author tofekkhan
 *
 */
@Service
public class AddressServiceImpl {
	//Logger logger = LoggerFactory.  (AddressServiceImpl.class);
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> getAddresses() {
		return (List<Address>) addressRepository.findAll();
	}

	public AddressResponse createAddress(AddressRequest addressRequest) {
		Address address = new Address();
		address.setPin(addressRequest.getPin());
		address.setStreetName(addressRequest.getStreet());
		addressRepository.save(address);
		return new AddressResponse(address);

	}

	public AddressResponse getAddresses(int id) {
		System.out.println("Inside getAddress 1");
		Address address = addressRepository.findById(id).get();
		return new AddressResponse(address);
	}
}
