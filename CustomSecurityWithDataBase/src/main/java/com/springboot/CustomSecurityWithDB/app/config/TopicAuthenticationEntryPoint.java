package com.springboot.CustomSecurityWithDB.app.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class TopicAuthenticationEntryPoint extends
BasicAuthenticationEntryPoint{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		setRealmName("Topic security application Realm");
	}

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		response.addHeader("WWW-Authenticate",
				"Basic realm=\""+getRealmName()+"\"");
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
				authException.getMessage());
	}
	
	

}
