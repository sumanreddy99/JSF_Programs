package com.jsf.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent p) {
		// TODO Auto-generated method stub
		System.out.println("after phase"+p.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent p) {
		// TODO Auto-generated method stub
		System.out.println("before phase"+p.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

	
}
