/**
 * 
 */
package com.springcloud.address.repository;

import org.springframework.data.repository.CrudRepository;

import com.springcloud.address.model.Address;

/**
 * @author tofekkhan
 *
 */
public interface AddressRepository extends CrudRepository<Address, Integer>{
		
}
