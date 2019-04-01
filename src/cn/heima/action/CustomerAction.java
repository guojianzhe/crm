package cn.heima.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.heima.domain.BaseDict;
import cn.heima.domain.Customer;
import cn.heima.service.CustomerService;

@Controller("customerAction")
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class CustomerAction extends ActionSupport implements  ModelDriven<Customer>{
	private List<BaseDict> listSource;
	private List<BaseDict> listIndustry;
	private List<BaseDict> listLevel;
	private List<BaseDict> listAll;
	private Customer customerFind;
	
	public Customer getCustomerFind() {
		return customerFind;
	}
	public List<BaseDict> getListSource() {
		return listSource;
	}
	public List<BaseDict> getListIndustry() {
		return listIndustry;
	}
	public List<BaseDict> getListLevel() {
		return listLevel;
	}
	
	
	public List<BaseDict> getListAll() {
		return listAll;
	}


	@Autowired
	private CustomerService customerService;
	
	
	@Action(value="customer_addUI",results= {@Result(name="addUI",location="/jsp/customer/add.jsp")})
	public String addUI() {
		//查询所有信息来源数据
		listSource = customerService.findBySource("002");
		//查询所有客户所属行业
		listIndustry = customerService.findByIndustry("001");
		//查询所有客户的级别
		listLevel = customerService.findByLevel("006");
		return "addUI";
	}
	//添加客户
	@Action(value="customer_save",results= {@Result(name="toShowList",type="redirectAction",location="customer_list")})
	public String save() {
		customerService.save(customer);
		
		return "toShowList";
	}
	
	//显示客户列表
	@Action(value="customer_list",results= {@Result(name="showList",location="/jsp/customer/list.jsp")})
	public String list() {
		
		//查询所有信息来源数据
		listSource = customerService.findBySource("002");
		//查询所有客户所属行业
		listIndustry = customerService.findByIndustry("001");
		//查询所有客户的级别
		listLevel = customerService.findByLevel("006");
		
		listAll = customerService.findAll();
		
		return "showList";
	}
	
	//条件查询
	@Action(value="customer_conditionFind",results= {@Result(name="toConditionFindlist",location="/jsp/customer/list.jsp")})
	public String conditionFind() {
		
		//获取一个hibernate提供的离线对象
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		
		dc.add(Restrictions.like("cust_name", "%"+customer.getCust_name()+"%"));
		
		if(customer.getCust_level().getDict_id()!=-1) {
			dc.add(Restrictions.eq("cust_level.dict_id", customer.getCust_level().getDict_id()));
		}
		if(customer.getCust_industry().getDict_id()!=-1) {
			dc.add(Restrictions.eq("cust_industry.dict_id", customer.getCust_industry().getDict_id()));
		}
		if(customer.getCust_source().getDict_id()!=-1) {
			dc.add(Restrictions.eq("cust_source.dict_id", customer.getCust_source().getDict_id()));
		}
		listAll = customerService.conditionFind(dc);
		//查询所有信息来源数据
		listSource = customerService.findBySource("002");
		//查询所有客户所属行业
		listIndustry = customerService.findByIndustry("001");
		//查询所有客户的级别
		listLevel = customerService.findByLevel("006");
		
		
		return "toConditionFindlist";
	}
	
	//到修改页面
	@Action(value="customer_edit",results= {@Result(name="eidtCustomer",location="/jsp/customer/edit.jsp")})
	public String edit() {
		
		//查询所有信息来源数据
		listSource = customerService.findBySource("002");
		//查询所有客户所属行业
		listIndustry = customerService.findByIndustry("001");
		//查询所有客户的级别
		listLevel = customerService.findByLevel("006");
		
		customerFind = customerService.findById(customer.getCust_id());
		
		System.out.println(customerFind);
		return "eidtCustomer";
	}
	
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	

}
