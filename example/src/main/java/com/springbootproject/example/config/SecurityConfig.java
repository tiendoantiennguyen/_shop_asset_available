package com.springbootproject.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public static PasswordEncoder encoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {

		UserDetails tim = User.builder().username("tim")
				.password("{bcrypt}$2a$12$YJM1THEvCYfnz4gvp9LLHOuQ8BcgEOfEAe9wkkh8tndySk3L0nyZi").roles("ADMIN")
				.build();

		UserDetails jason = User.builder().username("jason")
				.password("{bcrypt}$2a$12$YJM1THEvCYfnz4gvp9LLHOuQ8BcgEOfEAe9wkkh8tndySk3L0nyZi").roles("USER")
				.build();

		return new InMemoryUserDetailsManager(tim, jason);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(configurer -> configurer
				.requestMatchers(HttpMethod.GET, "/**").permitAll()
				.requestMatchers(HttpMethod.POST, "/account/register/**").permitAll()
/*				.requestMatchers(HttpMethod.PUT, "/api/admin/edit/**").hasRole("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/api/admin/delete/**").hasRole("ADMIN"))*/
		);

		http.httpBasic(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());

		return http.build();
	}

}
