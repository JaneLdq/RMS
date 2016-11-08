package edu.nju.rms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class IndexController {

	@RequestMapping(value="/")
	public String welcome(ModelMap model){
		return "index";
	}
	
}
