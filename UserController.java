package com.manoj.training.spring.springsessiondemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/userlogin/login", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody String login(@RequestBody UserLoginCredentials userCredentials,
			HttpServletRequest request, HttpServletResponse httpServletResponse) throws Exception {

		if (true) {
			// Retrieved User detail from database and setting user detail in
			// session.
//			LoggedInUser loggedInUser = userManager.getLoggedInUser(userCredentials.getUserName());	
			LoggedInUser loggedInUser = new LoggedInUser();
			if (loggedInUser != null) {
				loggedInUser.setDomainName(userCredentials.getSubDomainName());
				loggedInUser.setSessionId(request.getSession().getId());
				request.getSession().setAttribute("USER", loggedInUser);

				HttpSession session = request.getSession();
				String sessionId = session.getId();
				// loginResponse.setSystemRoleList(systemRoleList);
	 System.out.println("dfdsfdsf......"+sessionId);
				List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_SYSTEM_ROLE_USER");
				authorities.add(authority);

				SecurityContextHolder.getContext().setAuthentication(
						new UsernamePasswordAuthenticationToken(userCredentials.getUserName(), null, authorities));

				return sessionId;
			}
		}
		return null;

	}
	
	@RequestMapping(value = "/userlogin/logout", method = RequestMethod.GET)
	public @ResponseBody boolean logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			System.out.println("logout called");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return true;
	}
}
