package edu.nju.rms.service;

import edu.nju.rms.dao.UserDao;
import edu.nju.rms.model.User;

public class AuthServiceImpl implements AuthService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}

	public int login(String email, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
