package com.mtc.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.IProductDAOHib;
import com.dao.ProductDAOHib;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.ProductHib;

public class EditRecordAction extends ActionSupport {
	private ProductHib editProduct = new ProductHib();
	private IProductDAOHib productDAO;
	private int id;
	private String name,description;
	private float price;
	
	private List<ProductHib> productsList = new ArrayList<ProductHib>();
	public EditRecordAction() {
		productDAO= new ProductDAOHib();
	}

//	@Override
//	public ProductHib getModel() {
//		System.out.println("***************EditRecordAction: getModel()***********");
//		return editProduct;
//	}
	@Override
	public String execute() throws Exception {
		System.out.println("************ EditRecordAction :execute ()***********");
		editProduct.setId(id);
		editProduct.setName(name);
		editProduct.setDescription(description);
		editProduct.setPrice(price);
		
		productDAO.updateProduct(editProduct);
		System.out.println("Product Updated");
		productsList=fetchAllProducts();
		return "success";
	}
	public List<ProductHib> fetchAllProducts(){
		 productsList=productDAO.getProducts();
		 
		 return productsList;
	}


	public ProductHib getEditProduct() {
		return editProduct;
	}

	public void setEditProduct(ProductHib editProduct) {
		this.editProduct = editProduct;
	}

	
	public List<ProductHib> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<ProductHib> productsList) {
		this.productsList = productsList;
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

