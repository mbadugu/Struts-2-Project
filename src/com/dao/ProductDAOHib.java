package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibernateUtil;
import com.vo.ProductHib;

public class ProductDAOHib implements IProductDAOHib {

	@Override
	public void addProduct(ProductHib product) {
		Session session =HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.getTransaction();
				transaction.begin();
					session.save(product);
				transaction.commit();
		session.close();
		
	}

	@Override
	public ProductHib getProductById(int id) {
		Session session =HibernateUtil.getSessionFactory().openSession();
		ProductHib productHib =(ProductHib)session.get(ProductHib.class, id);
		return productHib;
	}

	@Override
	public List<ProductHib> getProducts() {
		Session session =HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from ProductHib");
		return query.list();
	}

	@Override
	public void updateProduct(ProductHib product) {
		Session session =HibernateUtil.getSessionFactory().openSession();
		try{
			Transaction transaction = session.getTransaction();
			transaction.begin();
				
				ProductHib productHib =(ProductHib)session.get(ProductHib.class,product.getId());
		if(productHib!=null){	
				productHib.setId(product.getId());
				productHib.setName(product.getName());
				productHib.setDescription(product.getDescription());
				productHib.setPrice(product.getPrice());
		
				session.update(productHib);
		}
			transaction.commit();
			session.close();
	}catch(Exception e)
		{
			System.out.println("e="+e.getMessage());
		}
	}

	@Override
	public void deleteProduct(int id) {
		Session session =HibernateUtil.getSessionFactory().openSession();
		try{
		Transaction transaction = session.getTransaction();
		transaction.begin();
		ProductHib productHib =(ProductHib)session.get(ProductHib.class,id);
			session.delete(productHib);
		transaction.commit();
		session.close();
		}
		catch(Exception e)
		{
		System.out.println("e="+e.getMessage());
		}
	}
}
