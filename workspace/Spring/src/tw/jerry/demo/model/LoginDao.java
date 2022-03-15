package tw.jerry.demo.model;

public class LoginDao {
	public LoginDao() {
	}

	public boolean checkLogin(String name, String pwd) {
		if ("jerry".equals(name) && "pwdd".equals(pwd)) {
			return true;
		}
		return false;
	}

}
