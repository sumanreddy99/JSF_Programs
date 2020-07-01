package com.jsf.web;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@RequestScoped
@ManagedBean
public class SelectManyCheckbox implements Serializable {

	
	private Map<String, String> items;

	private String[] selectItems;

	public String[] getSelectItems() {
		return selectItems;
	}

	public void setSelectItems(String[] selectItems) {
		this.selectItems = selectItems;
	}

	public String getItemtoString(){
        return Arrays.toString(selectItems);
    }
	
	public Map<String, String> getItems() {

		items = new HashMap<>();
		items.put("java", "progrmming in java");
		items.put("C", "programmoing in c");
		items.forEach((k, v) -> System.out.println(k + "  " + v));

		return items;
	}

	
	
	public void clear() {
		this.items = null;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	public String getItemDisplay() {
		return "selectManyCheckBox";
	}

	

}
