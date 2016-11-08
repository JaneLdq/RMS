package edu.nju.rms.dao;

import java.util.List;

import edu.nju.rms.model.User;

public interface UserDao {
	
	public int addUser(User user);
		
	public boolean deleteUser(String uid);
	
	public boolean updateUser(User user);
	
	public User getUser(int id);
	
	public List<User> getAllUser();

}
