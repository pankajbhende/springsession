package com.manoj.training.spring.springsessiondemo;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

/****************************************************************
 * Header File: WebMvcConfig.java Description: Class for configuring.
 * 
 *
 * Copyright (c) UltraTech, 2019
 ****************************************************************/
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	public WebMvcConfig() {
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		return view;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(this.converter());
		this.addDefaultHttpMessageConverters(converters);
	}

	@Bean
	public MappingJackson2HttpMessageConverter converter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.getObjectMapper().setSerializationInclusion(Include.NON_NULL);
		converter.setDefaultCharset(Charset.forName("UTF-8"));
		ArrayList<MediaType> list = new ArrayList<MediaType>();
		list.add(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE));
		converter.setSupportedMediaTypes(list);
		return converter;
	}
}
