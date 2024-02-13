package com.cafb.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name",nullable = false,length = 50)
	private String name;
	
	@Column(name = "lastName",nullable = false,length = 50)
	private String lastName;
	
	@Column(name = "email",nullable = false,length = 50, unique = true)
	private String email;
	
	 @Column(name = "password", nullable = false)  // Agrega el campo de contraseña
	    private String password;

	    // Constructor, getters y setters

	    // Constructor por defecto
	    public Students() {
	    }

	    // Constructor con parámetros
	    public Students(String name, String lastName, String email, String password) {
	    	super();
	        this.name = name;
	        this.lastName = lastName;
	        this.email = email;
	        this.password = password;
	    }
	    

	    // Getters y setters para todos los campos

	    
	    public String getPassword() {
	        return password;
	    }

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(String password) {
	        this.password = password;
	    }
	}

