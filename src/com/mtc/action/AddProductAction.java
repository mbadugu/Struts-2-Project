package com.mtc.action;

import java.util.List;

import com.dao.IProductDAOHib;
import com.dao.ProductDAOHib;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.ProductHib;
import com.vo.Register;

public class AddProductAction extends ActionSupport implements ModelDriven<ProductHib> {
	
	private int productId;
	private String productName;
	private String productDescription;
	private float productPrice;
	private ProductHib addProduct = new ProductHib();
	private IProductDAOHib productDAO;
	private List<ProductHib> productsList;
	
	public AddProductAction() {
		productDAO= new ProductDAOHib();
	}
	@Override
	public ProductHib getModel() {
		System.out.println("***************AddProductAction : getModel()***********");
		return addProduct;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("************ AddProductAction :execute ()***********");
		addProduct.setId(productId);
		addProduct.setName(productName);
		addProduct.setDescription(productDescription);
		addProduct.setPrice(productPrice);
		productDAO.addProduct(addProduct);
		productsList=fetchAllProducts();
		return "success";
}
public List<ProductHib> fetchAllProducts(){
	productsList=productDAO.getProducts();
	return productsList;
}
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public ProductHib getAddProduct() {
		return addProduct;
	}

	public void setAddProduct(ProductHib addProduct) {
		this.addProduct = addProduct;
	}
	public List<ProductHib> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<ProductHib> productsList) {
		this.productsList = productsList;
	}
	
	
}