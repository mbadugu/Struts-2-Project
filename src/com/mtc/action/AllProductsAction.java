package com.mtc.action;

import java.util.List;

import com.dao.IProductDAOHib;
import com.dao.ProductDAOHib;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.ProductHib;

public class AllProductsAction extends ActionSupport {
	
	private IProductDAOHib productDAOHib;
	
	private List<ProductHib> productsList;
	
	public AllProductsAction() {
		productDAOHib= new ProductDAOHib();
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("*****************AllProductsAction : execute()********** ");
	 productsList=productDAOHib.getProducts();
		
		return "success";
	}

	public List<ProductHib> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<ProductHib> productsList) {
		this.productsList = productsList;
	}

	
}
