/**
 * 
 */
package com.springcloud.student.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloud.student.conversion.AddressResponse;


/**
 * @author tofekkhan
 *
 */
@FeignClient(url="${address.service.url}", value = "address-feigh-client", path="/api/address-service")
public interface AddressFeignClient {
	
	@GetMapping("/addresses/{id}")
	public AddressResponse getAddressById(@PathVariable("id") int id);


}
