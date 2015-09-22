package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.vo.Product;

public class ProductDAO extends BaseDAO implements IProductDAO   {

	@Override
	public void addProduct(Product product) {
		Connection connection= null;
	
		String insertQuery="insert into test.product(product_id,product_name,product_price,product_description)"
				+"values(?,?,?,?)";
		try{
			
			connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, product.getId());
		preparedStatement.setString(2,product.getName());
		preparedStatement.setFloat(3, product.getPrice());
		preparedStatement.setString(4, product.getDescription());
		
		int i =preparedStatement.executeUpdate();
		if(i==1){
		System.out.println("Record added sucessfully");
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	}

	@Override
	public Product getProductById(int id) {
		
String query ="SELECT * FROM test.product  where product_id=?";
		
Product product =  null;
		Connection connection= null;
		
		try{
			
			
			connection=getConnection();
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			if(resultSet.next()){
				product= new Product();
				product.setId(resultSet.getInt("product_id"));
				product.setName(resultSet.getString("product_name"));
				product.setPrice(resultSet.getFloat("product_price"));
				product.setDescription(resultSet.getString("product_description"));
				}
			resultSet.close();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
		connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		return product;
	}
	
	

	@Override
	public ArrayList<Product> getProducts()  {
String query ="SELECT * FROM test.product";
		
		ArrayList<Product> productsList = new ArrayList<>();
		Connection connection= null;
		
		try{
			
			
			connection=getConnection();
			
			Statement statement=connection.createStatement();
			
			ResultSet resultSet= statement.executeQuery(query);
			
			while(resultSet.next()){
				Product product = new Product();
				product.setId(resultSet.getInt("product_id"));
				product.setName(resultSet.getString("product_name"));
				product.setPrice(resultSet.getFloat("product_price"));
				product.setDescription(resultSet.getString("product_description"));
				
				productsList.add(product);
				
			}
			resultSet.close();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
		connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		return productsList;
	}
	

	@Override
	public void updateProduct(Product product) {
		Connection connection= null;
		PreparedStatement preparedStatement= null;
		String updateQuery="update test.product set product_name=?,product_price=?,product_description=? where product_id=?";
				
		try{
			
			connection=getConnection();
		preparedStatement=connection.prepareStatement(updateQuery);
		preparedStatement.setInt(4, product.getId());
		preparedStatement.setString(1,product.getName());
		preparedStatement.setFloat(2, product.getPrice());
		preparedStatement.setString(3, product.getDescription());
		
		
		int i=preparedStatement.executeUpdate();
		if(i==1){
		System.out.println("Record updated sucessfully");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
		connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
	@Override
	public void deleteProduct(int id) {
		Connection connection= null;
		
		String deleteQuery="DELETE FROM test.product WHERE product_id = ?";
				
		try{
			
			connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
		preparedStatement.setInt(1, id);
		
		
		int i =preparedStatement.executeUpdate();
		if(i==1){
		System.out.println("Record deleted sucessfully");
	}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
		connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	}}
