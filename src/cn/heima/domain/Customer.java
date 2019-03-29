package cn.heima.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cst_customer")
public class Customer {
	@Id
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;  //客户编号
	private String cust_name;	//客户名称
	private Integer cust_source;	//客户信息来源
	private Integer cust_industry;	//客户所属行业
	private Integer cust_level;		//客户级别
	private String cust_phone;		//固定电话
	private String cust_mobile;		//移动电话
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Integer getCust_source() {
		return cust_source;
	}
	public void setCust_source(Integer cust_source) {
		this.cust_source = cust_source;
	}
	public Integer getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(Integer cust_industry) {
		this.cust_industry = cust_industry;
	}
	public Integer getCust_level() {
		return cust_level;
	}
	public void setCust_level(Integer cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cust_name=" + cust_name + ", cust_source=" + cust_source + ", cust_industry="
				+ cust_industry + ", cust_level=" + cust_level + ", cust_phone=" + cust_phone + ", cust_mobile="
				+ cust_mobile + "]";
	}
	
	
}
