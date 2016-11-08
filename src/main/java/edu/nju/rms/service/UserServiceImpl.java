package edu.nju.rms.service;

import edu.nju.rms.dao.UserDao;
import edu.nju.rms.model.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
		
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
