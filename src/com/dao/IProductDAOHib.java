package com.dao;

import java.util.List;

import com.vo.ProductHib;

public interface IProductDAOHib {
	public void addProduct(ProductHib product);
	public ProductHib getProductById(int id);
	public List<ProductHib> getProducts() ;
	public void updateProduct(ProductHib product);
	public void deleteProduct(int id);
	

}


