package cn.heima.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.heima.dao.CustomerDao;
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

}
