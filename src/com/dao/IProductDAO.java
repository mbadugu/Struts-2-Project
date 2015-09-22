package com.dao;

import java.util.ArrayList;

import com.vo.Product;

public interface IProductDAO {
	public void addProduct(Product product);
	public Product getProductById(int id);
	public ArrayList<Product> getProducts() ;
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	

}
