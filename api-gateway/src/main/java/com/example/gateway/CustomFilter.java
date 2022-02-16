/**
 * 
 */
package com.example.gateway;

import org.slf4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author tofekkhan
 *
 */
@Configuration
public class CustomFilter implements GlobalFilter {
	
	Logger logger  = org.slf4j.LoggerFactory.getLogger(CustomFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		logger.info("Pre filter - Authorization - "+exchange.getRequest().getHeaders().getFirst("Authorization"));
		
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			logger.info("Post filter - Status Code - "+exchange.getResponse().getStatusCode());
		}));
	}

}
