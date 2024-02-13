package com.cafb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafb.app.entity.Students;
import com.cafb.app.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping({"/listStudents", "/"})
	public String listStudent(Model model) {
		model.addAttribute("listStudents", service.listStudents());
		return "listStudents";
	}
	
	@GetMapping({"/listStudents/new"})
	public String formUsers(Model model) {
		Students student = new Students();
		model.addAttribute("student",student);
		return "addUsers";
	}
	
	@PostMapping({"/addUser"})
	public String addUsers(@ModelAttribute("student") Students student) {
		service.saveStudents(student);
		return "redirect:/listStudents";
		
	}
	
	@GetMapping({"/listStudents/edit/{id}"})
	public String formEdit(@PathVariable Long id,Model model) {
		model.addAttribute("listStudents", service.getStudentById(id));
		return "formEditStudent";
	}
	//editar
	@PostMapping({"/listStudents/edit/{id}"})
	public String editStudent(@PathVariable Long id,@ModelAttribute("student") Students student,Model model) {
		Students selectStudents = service.getStudentById(id);
		selectStudents.setId(id);
		selectStudents.setName(student.getName());
		selectStudents.setLastName(student.getLastName());
		selectStudents.setEmail(student.getEmail());
		
		service.updateStudent(selectStudents);
		return "redirect:/listStudents";
	}
	
	//eliminar
	@GetMapping({"/listStudents/{id}"})
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "redirect:/listStudents";
	}
}
