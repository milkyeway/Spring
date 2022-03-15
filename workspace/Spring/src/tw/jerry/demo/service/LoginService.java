package tw.jerry.demo.service;

import tw.jerry.demo.model.LoginDao;

public class LoginService {

	private LoginDao loginDao;

	public LoginService() {
	}

	// 建構子注入
	public LoginService(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	// Setter 注入
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public boolean checkLogin(String username, String pwd) {
		return loginDao.checkLogin(username, pwd);
	}

}
