package cn.heima.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cst_customer")
public class Customer {
	@Id
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cid;  //�ͻ����
	private String cust_name;	//�ͻ�����
	
	private String cust_phone;		//�̶��绰
	private String cust_mobile;		//�ƶ��绰
	
	//3����� --3������
	@ManyToOne(targetEntity=BaseDict.class)
	//name:����ֶ���
	//referencedColumnName:ָ��������ֶ���
	@JoinColumn(name="cust_source",referencedColumnName="dist_id")
	private BaseDict cust_source;		//�ͻ���Ϣ��Դ
	@ManyToOne(targetEntity=BaseDict.class)
	@JoinColumn(name="cust_industry",referencedColumnName="dist_id")
	private BaseDict cust_industry;		//�ͻ�������ҵ
	@ManyToOne(targetEntity=BaseDict.class)
	@JoinColumn(name="cust_level",referencedColumnName="dist_id")
	private BaseDict cust_level;		//�ͻ�����
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
	
	public BaseDict getCust_source() {
		return cust_source;
	}
	public void setCust_source(BaseDict cust_source) {
		this.cust_source = cust_source;
	}
	public BaseDict getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(BaseDict cust_industry) {
		this.cust_industry = cust_industry;
	}
	public BaseDict getCust_level() {
		return cust_level;
	}
	public void setCust_level(BaseDict cust_level) {
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
