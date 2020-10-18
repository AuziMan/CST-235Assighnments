package packagecontrollers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped

public class formController 
{
	
	public String onSubmit()
	{
		//Get user managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class );
		
		//Forward to Test Response view along with the user managed bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "testResponse.xhtml"; 
	}

	public String onSubmit(User user) 
	{
		//Forward to test responce
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		return "testResponse.xhtml";
	}
	
	public String onFlash(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return"testResponse.xhtml?faces-redirect=true";
	}
	
}
