package com.programacionparaaprender.hello;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


@ManagedBean
@Named
@SessionScoped
public class StudentBean implements Serializable {
    
   /**
	 * 
	 */
	private static final long serialVersionUID = -8470241778864558950L;

	private String firstName;
	private String lastName;
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
