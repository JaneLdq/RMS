package edu.nju.rms.dao;

import java.util.List;

import edu.nju.rms.model.User;

public class UserDaoImpl implements UserDao {
	
	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteUser(String uid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
