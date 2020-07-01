package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "checkbox")
public class SelectBooleanCheckbox implements Serializable {

	private boolean property;

	public void clear() {
		this.property = false;
	}

	public boolean isProperty() {
		return property;
	}

	public void setProperty(boolean property) {
		this.property = property;
	}

	public String displayProperty() {
		return "selectBooleanCheckBox";
	}

}
