package com.revature.services;

import java.util.List;

import com.revature.dao.IUserDAO;
import com.revature.dao.UserDAO;
import com.revature.models.User;
import com.revature.templates.LoginTemplate;

// The service layer is a layer that is designed to enforce your "business logic"
// These are miscellaneous rules that define how your application will function
// 		Ex: May not withdraw money over the current balance
// All interaction with the DAO will be through this service layer
// This design is simply furthering the same design structure that we have used up to now
// How you go about designing the details of this layer is up to you
// Due to the nature of the "business logic" being rather arbitrary
// This layer has the MOST creativity involved
// Most other layers are pretty boilerplate, where you pretty much copy/paste most methods
public class UserService {
	
	private IUserDAO dao = new UserDAO();

	// A starting place that I like to use, is to also create CRUD methods in the service layer
	// that will be used to interact with the DAO
	
	// Then additionally, you can have extra methods to enforce whatever features/rules that you want
	// For example, we might also have a login/logout method
	
	public int insert(User u) {
		return dao.insert(u);
	}
	
	public List<User> findAll() {
		return dao.findAll();
	}
	
	public User findById(int id) {
		return dao.findById(id);
	}
	
	public User findByUsername(String username) {
		return dao.findByUsername(username);
	}
	
	public int update(User u) {
		return dao.update(u);
	}
	
	public int delete(int id) {
		return dao.delete(id);
	}
	
	public User login(LoginTemplate lt) {
		
		User userFromDB = findByUsername(lt.getUsername());
		
		// Username was incorrect
		if(userFromDB == null) {
			return null;
		}
		
		// Username was correct and so was password
		if(userFromDB.getPassword().equals(lt.getPassword())) {
			return userFromDB;
		}
		
		// Username was correct, but password was not
		return null;
	}
}
