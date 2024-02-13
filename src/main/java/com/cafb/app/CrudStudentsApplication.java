package com.cafb.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cafb.app.entity.Students;
import com.cafb.app.repository.StudentRepository;

@SpringBootApplication
public class CrudStudentsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudStudentsApplication.class, args);
		
	}
	
	@Autowired
	private StudentRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
	/*	Students students = new Students("admin","admin","admin@gmail.com","1234");
		
		repository.save(students);*/
	}
	
	
	

}
