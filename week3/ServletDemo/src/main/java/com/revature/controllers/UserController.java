package com.revature.controllers;

import javax.servlet.http.HttpSession;

import com.revature.exceptions.NotLoggedInException;
import com.revature.services.UserService;

public class UserController {

	private final UserService userService = new UserService();
	
	public boolean logout(HttpSession session) {
		try {
			userService.logout(session);
		} catch(NotLoggedInException e) {
			return false;
		}
		return true;
	}
}
