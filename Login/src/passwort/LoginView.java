package passwort;
import javax.faces.bean.Application;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class LoginView {
	
	private final static String superSecret ="iboistkingamk";
	private final static String besteUser ="admin";
	private String password;
	private String username;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
