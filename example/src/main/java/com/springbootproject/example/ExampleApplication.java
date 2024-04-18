package com.springbootproject.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.springbootproject.example.config.CustomSitemeshFilter;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean<CustomSitemeshFilter> sitemeshFilter(){
		FilterRegistrationBean<CustomSitemeshFilter> filterRegistrationBean = new FilterRegistrationBean<CustomSitemeshFilter>();
		filterRegistrationBean.setFilter(new CustomSitemeshFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

}
