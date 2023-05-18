package com.springcloudtutorial.springfeignclient.errordecoder;

import java.util.ArrayList;
import java.util.List;

import com.springcloudtutorial.springfeignclient.feign.ProductServiceClient;
import com.springcloudtutorial.springfeignclient.model.Product;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductFallback implements ProductServiceClient{

	private final Throwable cause;
    
	public ProductFallback(Throwable cause) {
        this.cause = cause;
    }
	
	@Override
	public List<Product> getProductsByUserId(Long userId) {
		
		if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            log.error("404 error took place when getProductsByUserId was called with userId: "
                    + userId +  ". Error message: "
                    + cause.getLocalizedMessage());
        } else {
            log.error("Other error took place: " + cause.getLocalizedMessage());
        }
		
		return new ArrayList<>();
	}
	
}
