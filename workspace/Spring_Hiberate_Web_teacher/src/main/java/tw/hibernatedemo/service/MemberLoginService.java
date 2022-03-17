package tw.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

@Service
public class MemberLoginService {

	@Autowired
	private MemberDao dao;

	public Member checkLogin(String loginName, String loginPwd) {
		Member memberBean = dao.findByNameAndPwd(loginName, loginPwd);

		if (memberBean != null) {
			return memberBean;
		}

		return null;

	}

}