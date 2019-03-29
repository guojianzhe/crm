package cn.heima.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.heima.domain.Customer;
import cn.heima.service.CustomerService;

@Controller("customerAction")
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/")
public class CustomerAction extends ActionSupport implements  ModelDriven<Customer>{
	
	@Autowired
	private CustomerService customerService;
	
	@Action(value="customer_save")
	public String save() {
		customerService.save(customer);
		
		return null;
	}
	@Action(value="customer_addUI",results= {@Result(name="addUI",location="/jsp/customer/add.jsp")})
	public String addUI() {
		
		System.out.println(111);
		return "addUI";
	}
	
	
	
	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	

}
