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

public class UserDAO implements IUserDAO {

	@Override
	public int insert(User u) {
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			String columns = "username, password, first_name, last_name, email, role_id";
			String sql = "INSERT INTO USERS (" + columns + ") VALUES (?, ?, ?, ?, ?, ?)";
			// The ? marks are placeholders for input values
			// They work for PreparedStatements, and are designed to protect from SQL Injection
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// We insert values into each of the ? marks above
			stmt.setString(1, u.getUsername()); // replace 1st ? mark with u.getUsername()
			stmt.setString(2, u.getPassword()); // replace 2nd ? mark with u.getPassword()
			stmt.setString(3, u.getFirstName()); // replace 3rd ? mark with u.getFirstName()
			stmt.setString(4, u.getLastName());
			stmt.setString(5, u.getEmail());
			stmt.setInt(6, u.getRole().getId());
			
			return stmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<User> findAll() {
		List<User> allUsers = new ArrayList<>();
		
		// Below is a try-with-resources block
		// It allows us to instantiate some variable for use only inside the try block
		// And then at the end, it will automatically invoke the close() method on the resource
		// The close() method prevents memory leaks
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM USERS INNER JOIN ROLES ON USERS.role_id = ROLES.id";
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				int roleId = rs.getInt("role_id");
				String roleName = rs.getString("role");
				
				Role role = new Role(roleId, roleName);
				User u = new User(id, username, password, firstName, lastName, email, role);
				
				allUsers.add(u);
			}
		} catch(SQLException e) {
			// If something goes wrong, return an empty list
			e.printStackTrace();
			return new ArrayList<>();
		}
		
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
