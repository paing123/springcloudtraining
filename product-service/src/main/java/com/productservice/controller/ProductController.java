package com.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.model.Product;
import com.productservice.service.ProductServie;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("product-api")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductServie productService;
	
	@GetMapping(value="/products")
    public List<Product> getAllProducts(){
        return productService.findAllProducts();
    }
	
	@PostMapping(value="/products")
    public Product addProduct(@RequestBody Product product) throws Exception {
        return productService.saveProduct(product);
    } 
	
	@GetMapping( value="/users/{id}/products")
    public List<Product> getUserProducts(@PathVariable Long id) {
       return productService.findProductsByUserId(id);
    }
}
