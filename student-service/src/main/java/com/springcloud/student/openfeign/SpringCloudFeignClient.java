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
@FeignClient(value = "api-gateway")
public interface SpringCloudFeignClient {
	
	@GetMapping("/address-service/api/address-service/addresses/{id}")
	public AddressResponse getAddressById(@PathVariable("id") int id);


}
