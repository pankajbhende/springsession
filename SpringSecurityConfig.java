package com.manoj.training.spring.springsessiondemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/// common
		http.csrf().disable().authorizeRequests().antMatchers("/userlogin/login").permitAll()
		
				.antMatchers("/webjars/**").permitAll().antMatchers("/userlogin/test")
				.hasAnyRole("ROLE_USER","ROLE_ADMIN");

		http.headers().frameOptions().disable();
	}
	
}
