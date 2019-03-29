package cn.heima.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.heima.dao.CustomerDao;
import cn.heima.domain.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void save(Customer customer) {
		hibernateTemplate.save(customer);
		
	}

}
