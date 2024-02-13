package com.cafb.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafb.app.entity.Students;
import com.cafb.app.repository.StudentRepository;

//Este metodo estará disponible en la interface de StudentService
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Students> listStudents() {
		//este metodo viene de jpaRepository
		return repository.findAll();
	}
	@Override
	public Students saveStudents(Students student) {
		return repository.save(student);
	}
	@Override
	public Students getStudentById(Long id) {
		return repository.findById(id).get(); 
	}
	@Override
	public Students updateStudent(Students student) {
		return repository.save(student);
	}
	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
		
	}

}
