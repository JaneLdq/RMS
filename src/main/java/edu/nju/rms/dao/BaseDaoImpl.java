package edu.nju.rms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImpl implements BaseDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}

	public Session getNewSession() {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public Object load(Class c, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAllList(Class c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getTotalCount(Class c) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Object bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Object bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Object bean) {
		// TODO Auto-generated method stub
		return false;
	}

	public void delete(Class c, String id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Class c, String[] ids) {
		// TODO Auto-generated method stub
		
	}

}
