package com.java.study.jun.spring.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.java.study.jun.spring.ssm.entity.User;
import com.java.study.jun.spring.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) {
		User resultUser = userService.login(user);
		if (resultUser == null) {
			System.out.println("null");
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！11111");
			return "index";
		} else {
			System.out.println("not null");
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", resultUser);
			return "redirect:/success.jsp";
		}
//		return "";
	}
}
