package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

/**
 * This is a class that follows the DAO Design Pattern.
 * 
 * DAO stands for Data Access Object, and it is responsible for handling
 * all logic that will be used to interact with the Database.
 * 
 * That way, other parts of our application can interact with the database without
 * needing to think about this complex logic.
 * 
 * We can simply use the methods available on the interface.
 */
public class UserDAO implements IUserDAO {

	@Override
	public int insert(User u) {
		
		// Step 1: Get a Connection using ConnectionUtil
		// The Connection interface represents the physical connection to the database
		try (Connection conn = ConnectionUtil.getConnection()) {
			
			// Step 2: Define our SQL Statements
			String columns = "username, password, first_name, last_name, email, role_id";
			String sql = "INSERT INTO USERS (" + columns + ") VALUES (?, ?, ?, ?, ?, ?)";
			// The ? marks are placeholders for input values
			// They work for PreparedStatements, and are designed to protect from SQL Injection
			
			// Step 3: Obtain our Statement object
			// PreparedStatements are a sub-interface of Statement that provide extra security to prevent
			// SQL Injection. It accomplishes this by allowing to use ? marks that we can replace
			// with whatever data we want
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// Step 3b: If we are using a PreparedStatement, then inject values to replace the ? marks
			// We insert values into each of the ? marks above
			// Note: It is HEAVILY Recommended to use PreparedStatements instead of String concatenation
			stmt.setString(1, u.getUsername()); // replace 1st ? mark with u.getUsername()
			stmt.setString(2, u.getPassword()); // replace 2nd ? mark with u.getPassword()
			stmt.setString(3, u.getFirstName()); // replace 3rd ? mark with u.getFirstName()
			stmt.setString(4, u.getLastName());
			stmt.setString(5, u.getEmail());
			stmt.setInt(6, u.getRole().getId());
			
			// Step 4: Execute the Statement
			return stmt.executeUpdate();
			
		} catch(SQLException e) {
			// Step 5: Perform any exception handling in an appropriate means
			
			// This particular example might not be what you want to ultimately use
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<User> findAll() {
		// In this method, we are planning on returning ALL User objects
		// So we prepare the List<User> at the top
		List<User> allUsers = new ArrayList<>();
		
		// Below is a try-with-resources block
		// It allows us to instantiate some variable for use only inside the try block
		// And then at the end, it will automatically invoke the close() method on the resource
		// The close() method prevents memory leaks
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM USERS INNER JOIN ROLES ON USERS.role_id = ROLES.id";
			
			Statement stmt = conn.createStatement();
			
			
			// Steps 1 - 3 are the same as listed above, except there is
			// a ResultSet returned from executing our statement
			
			// We must make sure to use this ResultSet to save our data to the List that was prepared at the top
			// The ResultSet interface represents all of the data obtained from our query.
			// It has data for every column that we obtained from our query, per record
			ResultSet rs = stmt.executeQuery(sql);
			
			// ResultSets are similar to iterators, so this while-loop will allow us to iterate over every record
			while(rs.next()) {
				// We obtain the data from every column that we need
				
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				int roleId = rs.getInt("role_id");
				String roleName = rs.getString("role");
				
				// And use that data to create a User object accordingly
				Role role = new Role(roleId, roleName);
				User u = new User(id, username, password, firstName, lastName, email, role);
				
				// Then we make sure to add this User to our list
				allUsers.add(u);
			}
		} catch(SQLException e) {
			// If something goes wrong, return an empty list
			e.printStackTrace();
			return new ArrayList<>();
		}
		
		// At the end we simply return all of our Users
		return allUsers;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
