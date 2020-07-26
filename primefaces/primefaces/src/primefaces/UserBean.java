package primefaces;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean(name = "user")
@RequestScoped
public class UserBean implements Serializable
{
	
	private String name;
	
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public void submit() {
	FacesContext context=FacesContext.getCurrentInstance();
	context.addMessage(null, new FacesMessage("login successfull", " welcome " +name));

}
public void message() {
	String msg=check ? "accepted" : "not accepted";
	System.out.println(msg);
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
	
}
	
}
