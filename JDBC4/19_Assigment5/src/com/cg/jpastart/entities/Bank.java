package com.cg.jpastart.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Bank_mast")

public class Bank {
	@Id
	@Column(name = "Bank_id")
	private int id;
	private String name;
	private String headOfficelocation;
	
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="bList", cascade=CascadeType.ALL)
	List<Customer> list = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		this.list.add(customer);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadOfficelocation() {
		return headOfficelocation;
	}
	public void setHeadOfficelocation(String headOfficelocation) {
		this.headOfficelocation = headOfficelocation;
	}
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
	public Bank(int id, String name, String headOfficelocation) {
		super();
		this.id = id;
		this.name = name;
		this.headOfficelocation = headOfficelocation;
	}
	public Bank() {
		super();
	}
    
}
