/**
 * 
 */
package com.springcloud.address.service;

import java.util.List;

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
		Address address = addressRepository.findById(id).get();
		return new AddressResponse(address);
	}
}
