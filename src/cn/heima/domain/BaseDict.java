package cn.heima.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.struts2.convention.annotation.ParentPackage;

// 1
@Entity
@ParentPackage("base_dict")
public class BaseDict
{
	@Id
	@Column(name="dict_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer dict_id;// '�����ֵ�id(����)',
	private String dict_type_code;// '�����ֵ�������',
	private String dict_type_name;//'�����ֵ��������',
	private String dict_item_name;// '�����ֵ���Ŀ����',
	private String dict_item_code;// '�����ֵ���Ŀ(��Ϊ��)',
	private Integer dict_sort;// '�����ֶ�',
	private String dict_enable;// '1:ʹ�� 0:ͣ��',
	private String dict_memo;// '��ע',
	public Integer getDict_id() {
		return dict_id;
	}
	public void setDict_id(Integer dict_id) {
		this.dict_id = dict_id;
	}
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	public String getDict_type_name() {
		return dict_type_name;
	}
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	public String getDict_item_name() {
		return dict_item_name;
	}
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	public String getDict_item_code() {
		return dict_item_code;
	}
	public void setDict_item_code(String dict_item_code) {
		this.dict_item_code = dict_item_code;
	}
	public Integer getDict_sort() {
		return dict_sort;
	}
	public void setDict_sort(Integer dict_sort) {
		this.dict_sort = dict_sort;
	}
	public String getDict_enable() {
		return dict_enable;
	}
	public void setDict_enable(String dict_enable) {
		this.dict_enable = dict_enable;
	}
	public String getDict_memo() {
		return dict_memo;
	}
	public void setDict_memo(String dict_memo) {
		this.dict_memo = dict_memo;
	}
	
	
	
}
