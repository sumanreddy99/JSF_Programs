package primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "inputTextArea")
@RequestScoped
public class InputTextAreaBean implements Serializable
{
	List<String> result=new ArrayList<String>();
	public List<String> populateTextArea(String query){
		
		if(query.equalsIgnoreCase("harsha")) {
		result.add("harsha good boy");
		result.add("harsha good boy  100 harsha");
		result.add("harsha good boy 200 ");
		result.add("harsha good boy 300");
		}else {
			for(int i=0;i<10;i++) {
				result.add(query + i);
			}
		}
			
		
		
		
		return result;
		
		
		
		
		
	}

	
}
