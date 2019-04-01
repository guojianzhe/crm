package cn.heima.daoImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.heima.dao.CustomerDao;
import cn.heima.domain.BaseDict;
import cn.heima.domain.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void save(Customer customer) {
		hibernateTemplate.save(customer);
		
	}
	@Override
	public List<BaseDict> findBySource(String string) {
		
		
		return (List<BaseDict>) hibernateTemplate.find("from BaseDict where dict_type_code=?", string);
	}
	@Override
	public List<BaseDict> findByIndustry(String string) {
		
		return (List<BaseDict>) hibernateTemplate.find("from BaseDict where dict_type_code=?", string);
	}
	@Override
	public List<BaseDict> findByLevel(String string) {
		
		return (List<BaseDict>) hibernateTemplate.find("from BaseDict where dict_type_code=?", string);
	}
	@Override
	public List<BaseDict> findAll() {
		// TODO Auto-generated method stub
		return (List<BaseDict>) hibernateTemplate.find("from Customer");
	}
	@Override
	public List<BaseDict> conditionFind(DetachedCriteria dc) {
		// TODO Auto-generated method stub
		return (List<BaseDict>) hibernateTemplate.findByCriteria(dc);
	}
	@Override
	public Customer findById(Integer cust_id) {
		
		return hibernateTemplate.get(Customer.class, cust_id);
	}

}
