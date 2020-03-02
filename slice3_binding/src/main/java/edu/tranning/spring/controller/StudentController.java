package edu.tranning.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.tranning.spring.model.Major;
import edu.tranning.spring.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@ModelAttribute("majors")
	List<Major> getMajors(){
		
		List<Major> list = new ArrayList<>();
		Major m1 = new Major(1,"Java Jav");
		Major m2 = new Major(2,"PHP Người Lớn");
		Major m3 = new Major(3,"C# động vật");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
	}
	
	
	
	
	@GetMapping("/add")
	public String add(ModelMap model) {
		Student student = new Student();
		student.setId("ST01");
		student.setName("Tèo Tống");
		student.setMajorId(1);
		
		model.addAttribute("student", student);
		
		return "students/add";
	}
	
	@PostMapping("/add")
	public String save(ModelMap model, Student student ) {
		System.out.println("Student: "+ student);
		
		Student student2 = new Student();
		
		model.addAttribute("student", student2);
		
		return "students/add";
	}
	
	
}
