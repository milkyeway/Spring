package tw.hibernatedemo.service;

import java.util.List;

import org.hibernate.Session;

import tw.hibernatedemo.model.CompanyBean;
import tw.hibernatedemo.model.CompanyDao;

public class CompanyService implements CompanyServiceInterface {
	
	private CompanyDao comDao;
	
	public CompanyService(Session session) {
		this.comDao = new CompanyDao(session);
	}

	@Override
	public CompanyBean insert(CompanyBean comBean) {
		CompanyBean oneCom = comDao.insert(comBean);
		return oneCom;
	}

	@Override
	public CompanyBean select(int comId) {
		CompanyBean theCom = comDao.select(comId);
		return theCom;
	}

	@Override
	public List<CompanyBean> selectAll() {
		return comDao.selectAll();
	}

	@Override
	public CompanyBean updateOne(int comId, String newName) {
		CompanyBean oneCom = comDao.updateOne(comId, newName);
		return oneCom;
	}

	@Override
	public boolean delete(int comId) {
		boolean boo = comDao.deleteOne(comId);
		return boo;
	}

}
