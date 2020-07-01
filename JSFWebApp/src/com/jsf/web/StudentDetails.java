package com.jsf.web;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="stu")

public class StudentDetails implements Serializable {

	private ArrayList<Student> stuList;
 
public ArrayList<Student> getStuList(){
	stuList=new ArrayList<Student>();
	
	Student  s1=new Student();
	s1.setName("Harssha");
	
	stuList.add(s1);
	
	return stuList;
}


}
