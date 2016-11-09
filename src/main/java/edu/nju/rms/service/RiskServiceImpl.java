package edu.nju.rms.service;

import java.util.List;

import edu.nju.rms.dao.RiskDao;
import edu.nju.rms.model.RiskProject;

public class RiskServiceImpl implements RiskService {

	private RiskDao riskDao;
	
	public void setRiskDao(RiskDao riskDao) {
		this.riskDao = riskDao;
	}
	
	public List<RiskProject> getAllRiskProject() {
		return riskDao.getAllRiskProject();
	}

}
