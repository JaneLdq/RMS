package edu.nju.rms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.rms.model.RiskProject;

@Repository
public class RiskDaoImpl implements RiskDao {

	private BaseDao baseDao;
	
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	public List<RiskProject> getAllRiskProject() {
		return baseDao.getAllList(RiskProject.class);
	}

}
