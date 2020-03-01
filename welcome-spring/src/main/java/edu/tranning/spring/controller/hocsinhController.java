package edu.tranning.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.tranning.spring.domain.Student;

@Controller
@RequestMapping("/student")
public class hocsinhController {
	
	@GetMapping("")
	public String showForm() {
		return "students/radioForm";
	}
	
	@PostMapping("")
	public String successInfo(ModelMap model, Student student) {
		model.addAttribute("name", student.getName());
		model.addAttribute("gpa", student.getGpa());
		model.addAttribute("major", student.getMajor());
		return "students/radiosuccess";
	}
	
}
