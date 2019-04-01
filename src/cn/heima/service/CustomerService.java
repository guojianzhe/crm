package cn.heima.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.heima.domain.BaseDict;
import cn.heima.domain.Customer;

public interface CustomerService {

	void save(Customer customer);

	List<BaseDict> findBySource(String string);

	List<BaseDict> findByIndustry(String string);

	List<BaseDict> findByLevel(String string);

	List<BaseDict> findAll();

	List<BaseDict> conditionFind(DetachedCriteria dc);

	Customer findById(Integer cust_id);

	
	
}
