package com.springcloudtutorial.springfeignclient.model;

import lombok.Data;

@Data
public class Product {	
    private Long productId;
	
	private Long userId;
	
	private String productName;
	
	private String productType;
}
