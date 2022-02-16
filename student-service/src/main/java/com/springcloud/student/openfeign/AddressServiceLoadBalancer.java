/**
 * 
 */
package com.springcloud.student.openfeign;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

/**
 * @author tofekkhan
 *
 */
@LoadBalancerClient(value = "address-service")
public class AddressServiceLoadBalancer {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder(){
		return Feign.builder();
	}
}
