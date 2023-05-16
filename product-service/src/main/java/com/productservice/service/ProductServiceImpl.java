package com.productservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.productservice.dao.ProductDao;
import com.productservice.model.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductServie{

	private final ProductDao productDao;
	
	@Override
	@Transactional
	public Product saveProduct(Product product) throws Exception {
		return productDao.save(product);
	}

	@Override
	public List<Product> findAllProducts() {
		return productDao.findAll();
	}

}
