package edu.nju.rms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class IndexController {

	@RequestMapping(value="/")
	public String welcome(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException{
		if (request.getSession().getAttribute("uid") != null) {
			response.sendRedirect(request.getContextPath() + "/home");
		}
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
			model.put("msg", msg);
		}
		return "index";
	}
	
}
