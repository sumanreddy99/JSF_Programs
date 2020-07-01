package com.jsf.web;

import java.io.Serializable;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class SelectManyCheckboxUsingList implements Serializable {

	
	//private ArrayList<String> courses;

	private String[] selectCourse;

	private String dis_selectCourse;

	
	public String[] getSelectCourse() {
		return selectCourse;
	}

	public void setSelectCourse(String[] selectCourse) {
		this.selectCourse = selectCourse;
	}

	public String getCoursetoString(){
		dis_selectCourse=Arrays.toString(selectCourse);
        return dis_selectCourse;
    }
	
	
	
	public String getDis_selectCourse() {
		return dis_selectCourse;
	}

	public void setDis_selectCourse(String dis_selectCourse) {
		this.dis_selectCourse = dis_selectCourse;
	}

	/*
	 * public ArrayList<String> getCourses() { return courses; }
	 * 
	 * public void setCourses(ArrayList<String> courses) { this.courses = courses; }
	 */
	public void clear() {
	///	this.courses = null;
	}

	
	public String getItemDisplay() {
		return "selectManyCheckBoxUsingList";
	}

	

}
