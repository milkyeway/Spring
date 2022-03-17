package tw.hibernatedemo.service;

import java.util.List;

import tw.hibernatedemo.model.CompanyBean;

public interface CompanyServiceInterface {
	CompanyBean insert(CompanyBean comBean);
	CompanyBean select(int comId);
	List<CompanyBean> selectAll();
	CompanyBean updateOne(int comId, String newName);
	boolean delete(int comId);
}
