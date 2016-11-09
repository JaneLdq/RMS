package edu.nju.rms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class IndexController {

	@RequestMapping(value="/")
	public String welcome(HttpServletRequest request, ModelMap model){
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
			model.put("msg", msg);
		}
		return "index";
	}
	
}
