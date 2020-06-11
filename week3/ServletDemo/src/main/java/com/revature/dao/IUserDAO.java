package com.revature.dao;

import java.util.List;

import com.revature.models.User;

/**
 * This is an interface that defines what methods we plan to use to
 * interact with the database.
 * 
 * We have methods for all 4 CRUD operations.
 * 
 * We additionally have a few extra helpful Read operations,
 * since they might come in handy.
 * 
 * It is good design to have an interface for our DAO classes.
 */
public interface IUserDAO {

	public int insert(User u); // CREATE
	
	public List<User> findAll(); // READ
	public User findById(int id);
	public User findByUsername(String username);
	
	public int update(User u); // UPDATE
	
	public int delete(int id); // DELETE
}
