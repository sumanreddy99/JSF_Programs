package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean(name="user")
public class UserDetails implements Serializable {

	private String name;
	
	
	public String getName() {
		return name;
	}



public void clear() {
	this.name="";
}
	public void setName(String name) {
		this.name = name;
	}




	private String save() {
		return "success";
	}
	
}
