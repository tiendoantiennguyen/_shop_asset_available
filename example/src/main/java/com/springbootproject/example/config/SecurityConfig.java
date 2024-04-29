package com.springbootproject.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.springbootproject.example.service.web.user.userImpl.CustomUserDetailService;
import com.springbootproject.example.service.web.user.userImpl.UserServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	/*
	 * @Bean public static PasswordEncoder encoder() { return
	 * PasswordEncoderFactories.createDelegatingPasswordEncoder(); }
	 * 
	 * @Bean public InMemoryUserDetailsManager userDetailsManager() {
	 * 
	 * UserDetails tim = User.builder().username("tim") .password(
	 * "{bcrypt}$2a$12$YJM1THEvCYfnz4gvp9LLHOuQ8BcgEOfEAe9wkkh8tndySk3L0nyZi").roles
	 * ("ADMIN") .build();
	 * 
	 * UserDetails jason = User.builder().username("jason") .password(
	 * "{bcrypt}$2a$12$YJM1THEvCYfnz4gvp9LLHOuQ8BcgEOfEAe9wkkh8tndySk3L0nyZi").roles
	 * ("USER") .build();
	 * 
	 * return new InMemoryUserDetailsManager(tim, jason); }
	 * 
	 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
	 * Exception {
	 * 
	 * http.authorizeHttpRequests(configurer -> configurer
	 * .requestMatchers(HttpMethod.GET, "/**").permitAll()
	 * .requestMatchers(HttpMethod.POST, "/account/register/**").permitAll()
	 * .requestMatchers(HttpMethod.PUT, "/api/admin/edit/**").hasRole("ADMIN")
	 * .requestMatchers(HttpMethod.DELETE, "/api/admin/delete/**").hasRole("ADMIN"))
	 * );
	 * 
	 * http.httpBasic(Customizer.withDefaults()); http.csrf(csrf -> csrf.disable());
	 * 
	 * return http.build(); }
	 */

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// kiem tra userservice co dung pass hay khong thi cho vo
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customUserDetailService);
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}

	// kiem tra pass encoding co dung voi pass minh xac nhan hay khong
	protected void config(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());

	}

	// dinh nghia bo loc authentication cho he thong biet
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		final List<GlobalAuthenticationConfigurerAdapter> configurers = new ArrayList<>();
		configurers.add(new GlobalAuthenticationConfigurerAdapter() {
			@Override
			public void configure(AuthenticationManagerBuilder auth) throws Exception {

			}
		});
		return authConfig.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		/*
		 * return http.csrf().disable() .authorizeHttpRequests()
		 * .requestMatchers(HttpMethod.GET, "/**").permitAll()
		 * .requestMatchers(HttpMethod.POST, "/account/register/**").permitAll()
		 * .anyRequest().authenticated() .and() .httpBasic() .and()
		 * .formLogin().loginPage("/login").permitAll() .and() .logout().permitAll()
		 * .and() .exceptionHandling().accessDeniedPage("/403") .and() .build();
		 */

		http.authorizeHttpRequests(configurer -> configurer.requestMatchers(HttpMethod.GET, "/**").permitAll()
				.requestMatchers(HttpMethod.POST, "/web/account/register/**").permitAll()
				.requestMatchers(HttpMethod.PUT, "/api/admin/edit/**").hasRole("ADMIN")
				.requestMatchers(HttpMethod.DELETE, "/api/admin/delete/**").hasRole("ADMIN"))
		/*
		 * .formLogin(form -> form .loginPage("/web/account/login")
		 * .loginProcessingUrl("/web/account/login") .permitAll() )
		 */
		; 

		http.httpBasic(Customizer.withDefaults());
		http.csrf(csrf -> csrf.disable());

		return http.build();
	}

}
