package com.cafb.app.services;

import java.util.List;

import com.cafb.app.entity.Students;

public interface StudentService {

	public List<Students> listStudents();
	
	public Students saveStudents(Students student);
	
	public Students getStudentById(Long id);
	
	public Students updateStudent(Students student);
	
	public void deleteStudent(Long id);
}
