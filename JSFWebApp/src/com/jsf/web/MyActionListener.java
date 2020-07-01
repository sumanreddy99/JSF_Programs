package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MyActionListener implements ActionListener {

	public void processAction(ActionEvent ae) throws AbortProcessingException {
		System.out.println("ACtion Event " + ae.getComponent().getId());
	}

}
