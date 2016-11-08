package edu.nju.rms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class IndexController {

	@RequestMapping(value="/index")
	public String index(ModelMap model){
		return "index";
	}
	
}
