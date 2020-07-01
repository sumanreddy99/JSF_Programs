package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean(name="area")
public class InputTextArea implements Serializable {

	private String address;
	
	
	public void clear() {
	this.address="";
   }
	
	
	
	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String displayArea() {
		return "inputTextArea";
	}
	
}
