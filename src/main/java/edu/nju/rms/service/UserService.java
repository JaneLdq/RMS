package edu.nju.rms.service;

import edu.nju.rms.model.User;

public interface UserService {
	
	public boolean updateUser(User user);
	
	public void addUser(User user);

	public User getUser(int uid);
	
	public User check(String username, String password);
	
}
