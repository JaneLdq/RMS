package edu.nju.rms.service;

import edu.nju.rms.model.User;

public interface AuthService {

	public int login(String email, String password);
	
	public int register(User user);
	
}
