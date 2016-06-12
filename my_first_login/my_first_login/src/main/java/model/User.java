package model;

import javax.faces.context.FacesContext;

public class User {
	private String name;
	private String password;
	private boolean loggedIn;

	public User() {
		loggedIn = false;
	}

	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if(name.equals(getName())&&password.equals(getPassword()))
		{
			loggedIn=true;
			return "success";
		}else
		{
			return "failed";	
		}
		;
		// TODO name und password ueberpruefen - im Fehlerfall "failed" returnen,
		// ansonsten "loggedIn" auf true setzen und "success" returnen
		
	}

	public String logout() {
		loggedIn = false;
		// This session is now invalid!
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "logout";
	}
}