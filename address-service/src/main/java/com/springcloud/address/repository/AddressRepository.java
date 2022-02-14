/**
 * 
 */
package com.springcloud.address.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.address.model.Address;

/**
 * @author tofekkhan
 *
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{
		
}
