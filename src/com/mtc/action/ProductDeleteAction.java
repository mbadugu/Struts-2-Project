package com.mtc.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.IProductDAOHib;
import com.dao.ProductDAOHib;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.ProductHib;

public class ProductDeleteAction extends ActionSupport implements ModelDriven<ProductHib>{
	
	
	private IProductDAOHib productDAO;
	private List<ProductHib> productsList = new ArrayList<ProductHib>();
	private ProductHib productHib = new ProductHib();
	
	public ProductDeleteAction() {
		productDAO= new ProductDAOHib();
	}
	@Override
	public ProductHib getModel() {
		System.out.println("***************AddProductAction : getModel()***********");
		return productHib;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("******************ProductDeleteAction() : execute() ******************");
		
		int deleteId =productHib.getId(); 
		System.out.println("ProductID : " + deleteId);
	productDAO.deleteProduct(deleteId);
	System.out.println("Product deleted ");
	productsList=fetchAllProducts();
		return "success";
	}
	
	public List<ProductHib> fetchAllProducts(){
		 productsList=productDAO.getProducts();
		 
		 return productsList;
	}

	public List<ProductHib> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<ProductHib> productsList) {
		this.productsList = productsList;
	}
	public ProductHib getDeleteProduct() {
		return productHib;
	}
	public void setDeleteProduct(ProductHib deleteProduct) {
		this.productHib = deleteProduct;
	}

}
