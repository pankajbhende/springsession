
package com.manoj.training.spring.springsessiondemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

@Configuration
public class HttpSessionConfig {

	/**
	 * Method for configuring session Id exchanges Strategy. Header Strategy is
	 * used for exchanging session ID For UltraTech session id exchanged in
	 * the header. session id is exchanged in the key x-auth-token.
	 * 
	 * @return
	 */
	@Bean
	public HttpSessionStrategy httpSessionStrategy() {
		return new HeaderHttpSessionStrategy();
	}

}
