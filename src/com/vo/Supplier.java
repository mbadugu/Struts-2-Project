package com.vo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	
	@Id
	@Column(name="supplier_id")
	private int id;
	@Column(name="supplier_name")
	private String name;
	
//	@OneToMany(mappedBy="supplier")
//	private Set<ProductHib> product;
	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	public Supplier(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
//	public Set<ProductHib> getProduct() {
//		return product;
//	}
//	public void setProduct(Set<ProductHib> product) {
//		this.product = product;
//	}
	
}
