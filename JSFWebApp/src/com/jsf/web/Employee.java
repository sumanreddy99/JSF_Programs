package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="emp")
@RequestScoped
public class Employee implements Serializable {

	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String checkIn() {
		
		if(name.equals("harsha")) {
			return "success";
		}else {
			return "fail";
		}
	}
 }
