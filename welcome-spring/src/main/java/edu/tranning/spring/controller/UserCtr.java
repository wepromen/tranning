package edu.tranning.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.tranning.spring.domain.User;

@Controller
@RequestMapping("users")
public class UserCtr {
	
	@GetMapping("/new")
	public String show() {
		return "users/addOrEdit";
	}
	
	@GetMapping("/edit/{username}")
	public String showEdit(@PathVariable("username") String username) {
		System.out.println("Username: "+username);
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
	
//	@PostMapping("/saveOrUpdate")
//	public String saveOrUpdate(ModelMap model,
//			@RequestParam("username") String username,
//			@RequestParam("password") String password
//			) {
//		
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		System.out.println(username + password);
//		return "users/detail";
//	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model,User user) {
		
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		return "users/detail";
	}
	
	
}
