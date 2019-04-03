package cn.heima.serviceImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.heima.dao.CustomerDao;
import cn.heima.domain.BaseDict;
import cn.heima.domain.Customer;
import cn.heima.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
		
	}


	@Override
	public List<BaseDict> findBySource(String string) {
		// TODO Auto-generated method stub
		return customerDao.findBySource(string);
	}


	@Override
	public List<BaseDict> findByIndustry(String string) {
		// TODO Auto-generated method stub
		return customerDao.findByIndustry(string);
	}


	@Override
	public List<BaseDict> findByLevel(String string) {
		// TODO Auto-generated method stub
		return customerDao.findByLevel(string);
	}


	@Override
	public List<BaseDict> findAll() {
		
		return customerDao.findAll();
	}


	@Override
	public List<BaseDict> conditionFind(DetachedCriteria dc) {
		
		return customerDao.conditionFind(dc);
	}


	@Override
	public Customer findById(Integer cust_id) {
		
		return customerDao.findById(cust_id);
	}


	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}


	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
		
	}





}
