package edu.tranning.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("users")
public class UserCtr {
	
	@GetMapping("/new")
	public String show() {
		return "users/addOrEdit";
	}
	
//	@PostMapping("/saveOrUpdate")
//	public String saveOrUpdate(ModelMap model, HttpServletRequest request) {
//		String username = (String) request.getParameter("username");
//		String password = (String) request.getParameter("password");
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		System.out.println(username + password);
//		return "users/detail";
//	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model,
			@RequestParam("username") String username,
			@RequestParam("password") String password
			) {
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		System.out.println(username + password);
		return "users/detail";
	}
	
	
}
