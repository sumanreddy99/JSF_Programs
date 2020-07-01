package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean(name="secret")
public class InputSecretComponent implements Serializable {

	private String password;
	
	
	public void clear() {
	this.password="";
   }
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String dispalyPassword() {
		return "inputsecret";
	}
	
}
