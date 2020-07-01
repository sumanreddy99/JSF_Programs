package com.jsf.web;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean (name="test")

public class SelectOneListbox implements Serializable {

	/*
	 * private String[] selectedColor;
	 */
	private String courses;

       public String getCourses() {
		return courses;
	}
       public void setCourses(String courses) {
		this.courses = courses;
	}
	
	private  Map<String ,String> mCourses;
	/*
	 * static { mcolors=new LinkedHashMap<String, Object>();
	 * 
	 * mcolors.put("Color-Red", "R");
	 * 
	 * }
	 */
	
	
	
	public Map<String, String> getmCourses() {
	
		mCourses=new HashMap<String, String>();
			
		mCourses.put("Program in C", "C");
		
		mCourses.put("Program in java", "Java");
		
		return mCourses;
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
