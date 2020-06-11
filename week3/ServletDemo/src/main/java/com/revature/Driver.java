package com.revature;

import com.revature.dao.IUserDAO;
import com.revature.dao.UserDAO;
import com.revature.models.Role;
import com.revature.models.User;

/**
 * This class is just to test some of the methods to confirm that we
 * are actually interacting with our database
 * 
 * We create a User, insert it into the database, and then read all Users from it
 */
public class Driver {

	public static void main(String[] args) {
		IUserDAO dao = new UserDAO();
		
		User user = new User(0, "username2", "password", "first", "last", "email2@yahoo.com", new Role(1, "Standard"));
		System.out.println(dao.insert(user));
		
		for(User u : dao.findAll()) {
			System.out.println(u);
		}
	}

}
