package com.productservice.service;

import java.util.List;

import com.productservice.model.Product;

public interface ProductServie {
	
	Product saveProduct(Product product) throws Exception;

	List<Product> findAllProducts();
}
