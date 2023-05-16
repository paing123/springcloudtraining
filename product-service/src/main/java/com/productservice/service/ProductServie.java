package com.productservice.service;

import java.util.List;
import java.util.Optional;

import com.productservice.model.Product;

public interface ProductServie {
	
	Product saveProduct(Product product) throws Exception;

	List<Product> findAllProducts();
	
	List<Product> findProductsByUserId(Long id);
}
