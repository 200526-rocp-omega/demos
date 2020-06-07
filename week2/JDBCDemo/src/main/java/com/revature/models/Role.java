package com.revature.models;

import java.util.Objects;

/**
 * This class is a Model class. This means that it is intended to simply store data.
 * 
 * Our model classes effectively mirror the corresponding tables.
 * The primary difference is that instead of storing int variables for Foreign Keys,
 * we actually go the extra step to obtain the entire object that the foreign key was
 * referencing.
 * 
 * That extra step is optional, but is a very common and convenient design choice.
 * 
 * We also generally create 2 constructors: One with zero parameters, and one with all parameters.
 * We provide getters/setters, and we also override hashcode(), equals(), and toString().
 * 
 * This particular class relates to the ROLES table.
 */
public class Role {

	private int id;
	private String role;
	
	public Role() {
		super();
	}

	public Role(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Role)) {
			return false;
		}
		Role other = (Role) obj;
		return id == other.id && Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}
}
