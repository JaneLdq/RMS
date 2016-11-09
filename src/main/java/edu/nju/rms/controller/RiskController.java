package edu.nju.rms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.nju.rms.model.RiskProject;
import edu.nju.rms.service.RiskService;

@Controller
@RequestMapping(value="/home")
public class RiskController {
	
	private RiskService riskService;
	
	public void setRiskService(RiskService riskService) {
		this.riskService = riskService;
	}	
	
	@RequestMapping(value="")
	public String getRiskProjectList(ModelMap model) {
		List<RiskProject> projects = riskService.getAllRiskProject();
		model.put("projects", projects);
		return "/risk/project_list";
	}

}
