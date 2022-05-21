package com.sky.service;

import java.util.List;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

public interface ProductService {
	
	public void addProduct(Product product);
	
	
	public List<Product> getProduct();
	

}
