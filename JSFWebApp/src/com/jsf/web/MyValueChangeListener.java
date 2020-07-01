package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class MyValueChangeListener implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent v) throws AbortProcessingException{
		System.out.println(v.getOldValue() +" "+v.getNewValue());
	}

	

}
