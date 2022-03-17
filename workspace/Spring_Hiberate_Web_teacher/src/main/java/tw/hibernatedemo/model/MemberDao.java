package tw.hibernatedemo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tw.hibernatedemo.util.HibernateUtils;

public class MemberDao {
	
	private SessionFactory factory;
	
	public MemberDao() {
		this.factory = HibernateUtils.getSessionFactory();
	}
	
	public Member findByNameAndPwd(String username, String pwd) {
		Session session = factory.getCurrentSession();
		String hql = "FROM Member m where m.memberName = :name and m.memberPwd = :pwd";
		
		try {
			Member result = session.createQuery(hql, Member.class)
					.setParameter("name", username)
					.setParameter("pwd", pwd)
					.getSingleResult();
			if(result != null) {
				return result;
			}
		} catch(Exception e) {
			return null;
		}
		
		return null;
	}

}
