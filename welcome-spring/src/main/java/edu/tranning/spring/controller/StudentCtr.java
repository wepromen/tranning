package edu.tranning.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students/")
public class StudentCtr {
	@RequestMapping(value="/new", method = RequestMethod.GET)	
	public String newStudent() {
		System.out.println("New with Get");
		return "students/new"; 
	}
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveStudent() {
		System.out.println("New with Post");
		
		return "students/list";
	}
	
	
	@RequestMapping("/edit")
	public String editStudent() {
		return "students/edit";
		
	}
	
	@RequestMapping(value = "/new", params = "btnDelete", method = RequestMethod.POST)
	public String deleteStudent() {
		return "students/delete";
	}
	
	
	@RequestMapping(value = "/new", params = "btnList" , method = RequestMethod.POST)
	public String listStudents() {
		return"students/list";
	}
	
}
