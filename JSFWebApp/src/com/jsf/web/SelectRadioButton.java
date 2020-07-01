package com.jsf.web;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean

public class SelectRadioButton implements Serializable {

	/*
	 * private String[] selectedColor;
	 */
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	private  Map<String ,Object> mcolors;
	/*
	 * static { mcolors=new LinkedHashMap<String, Object>();
	 * 
	 * mcolors.put("Color-Red", "R");
	 * 
	 * }
	 */
	
	public Map<String, Object> getMcolors() {
	
		 mcolors=new LinkedHashMap<String, Object>();
			
			mcolors.put("Color-Red", "R");
		
		return mcolors;
	}
	
	/*
	 * public void setMcolors(Map<String, Object> mcolors) { this.mcolors = mcolors;
	 * }
	 */
	
	
	
	/*
	 * public String[] getSelectedColor() { return selectedColor; }
	 * 
	 * public void setSelectedColor(String[] selectedColor) { this.selectedColor =
	 * selectedColor; }
	 * 
	 * public String dispalySelectedColor() {
	 * System.out.println("selectedColor"+selectedColor); color =
	 * Arrays.toString(selectedColor); System.out.println("cplcor"+color); return
	 * color;
	 * 
	 * }
	 * 
	 * public String showColorPage() {
	 * System.out.println("selectedColor"+selectedColor); return
	 * "selectRadioButton"; }
	 */	
	
}
