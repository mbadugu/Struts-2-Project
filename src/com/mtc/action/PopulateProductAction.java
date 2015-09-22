package com.mtc.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.ProductHib;

public class PopulateProductAction extends ActionSupport{
	private ProductHib populateProduct = new ProductHib();
	private int id;
	private String name,description;
	private float price;
	
	public String execute() throws Exception {
		System.out.println("************ PopulateProductAction :execute ()***********");
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();
		populateProduct.setId(id);
		populateProduct.setName(name);
		populateProduct.setDescription(description);
		populateProduct.setPrice(price);
		out.println(populateProduct.getId());
		out.println(populateProduct.getName());
		out.println(populateProduct.getDescription());
		out.println(populateProduct.getPrice());
		out.flush();
		
		System.out.println("Product Populated Yahoo !!!! ");
	
		return "success";
	}

	public ProductHib getPopulateProduct() {
		return populateProduct;
	}

	public void setPopulateProduct(ProductHib populateProduct) {
		this.populateProduct = populateProduct;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
