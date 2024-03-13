package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.form.Repository.StudentRepository;
import com.form.entity.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	@GetMapping("/")
	public String from(){
		
		return "home";
	}
	@GetMapping("/save")
	public String save(@ModelAttribute Student student,Model m) {
		studentRepository.save(student);
		List<Student> all = (List<Student>) studentRepository.findAll();
		m.addAttribute("list",all);
		return "result";
	}
}
