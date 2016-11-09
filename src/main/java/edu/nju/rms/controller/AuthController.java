package edu.nju.rms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.nju.rms.model.User;
import edu.nju.rms.service.UserService;

@Controller
@RequestMapping(value="")
public class AuthController {
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}	
	
	@RequestMapping(value="/auth", method=RequestMethod.POST)
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		User user = userService.check(username, password);
		if( user != null){
			HttpSession session = (HttpSession) request.getSession();
			session.setAttribute("uid", user.getUid());
			if (username.equals("admin")) {
				session.setAttribute("admin", true);
			}
			response.sendRedirect(request.getContextPath()+ "/home");
		}else{
			request.setAttribute("msg", "用户名或密码错误!");
			request.getRequestDispatcher("/").forward(request, response);
		}
	}
	
	@RequestMapping(value="/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("uid");
		request.getSession().removeAttribute("admin");
		try {
			response.sendRedirect(request.getContextPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
