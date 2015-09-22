package com.mtc.action;

import com.dao.IProductDAOHib;
import com.dao.ProductDAOHib;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.ProductHib;

public class ProductAction extends ActionSupport {
	
	private int productId;
	private IProductDAOHib productDAO;
	private ProductHib productHib;
	
	public ProductAction() {
		productDAO= new ProductDAOHib();
	}
	
	@Override
	public String execute() throws Exception {
//		if(productHib==null){
//			throw new RuntimeException();
//		}
		System.out.println("********ProductAction: execute()*********");
		 productHib=productDAO.getProductById(productId);
		return "success";
	}

	public ProductHib getProductHib() {
		return productHib;
	}

	public void setProductHib(ProductHib productHib) {
		this.productHib = productHib;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	
}
