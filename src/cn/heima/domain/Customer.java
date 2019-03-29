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
	private Integer cid;  //�ͻ����
	private String cust_name;	//�ͻ�����
	private Integer cust_source;	//�ͻ���Ϣ��Դ
	private Integer cust_industry;	//�ͻ�������ҵ
	private Integer cust_level;		//�ͻ�����
	private String cust_phone;		//�̶��绰
	private String cust_mobile;		//�ƶ��绰
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
