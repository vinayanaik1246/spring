package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	
	@Autowired
	private static List<Product> products=new ArrayList<Product>();
	
	public void addProduct(Product product)
	{
		System.out.println("in repositor");
		products.add(product);
		
	}
	
	
	public List<Product> getProduct()
	{
		return products;
	}


	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
