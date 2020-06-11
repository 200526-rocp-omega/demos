package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.UserController;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = -4854248294011883310L;
	private static final UserController userController = new UserController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

		final String URI = req.getRequestURI().replace("/ServletDemo", "").replace("/", "");

		switch(URI) {
		case "logout":
			if(userController.logout(req.getSession(false))) {
				res.setStatus(200);
				res.getWriter().println("You have been successfully logged out");
			} else {
				res.setStatus(400);
				res.getWriter().println("You were not logged in to begin with");
			}
			break;
		}
	}
}
