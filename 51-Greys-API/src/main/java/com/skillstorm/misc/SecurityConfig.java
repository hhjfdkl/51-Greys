package com.skillstorm.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		
		http.httpBasic(Customizer.withDefaults());
		http.authorizeHttpRequests(reqs -> {
			reqs.requestMatchers(HttpMethod.GET, "").authenticated();
			reqs.requestMatchers(HttpMethod.GET, "").authenticated();
		});
		return null;
	}
	
}
