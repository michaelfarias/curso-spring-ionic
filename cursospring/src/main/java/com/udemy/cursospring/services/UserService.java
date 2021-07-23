package com.udemy.cursospring.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.udemy.cursospring.secutiry.UserSS;

public class UserService {

	public static UserSS autheticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
