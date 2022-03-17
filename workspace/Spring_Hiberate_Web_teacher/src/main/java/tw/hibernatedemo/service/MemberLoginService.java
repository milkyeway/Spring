package tw.hibernatedemo.service;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

public class MemberLoginService {
	
	private MemberDao dao;
	
	public MemberLoginService() {
		this.dao = new MemberDao();
	}
	
	public Member checkLogin(String loginName, String loginPwd) {
		Member memberBean = dao.findByNameAndPwd(loginName, loginPwd);
		
		if(memberBean != null) {
			return memberBean;
		}
		
		return null;
		
	}

}
