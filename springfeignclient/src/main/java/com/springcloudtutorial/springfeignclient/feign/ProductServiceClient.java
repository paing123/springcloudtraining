package com.springcloudtutorial.springfeignclient.feign;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloudtutorial.springfeignclient.errordecoder.ProductFallback;
import com.springcloudtutorial.springfeignclient.model.Product;

@FeignClient(name="product-service", url="http://localhost:63287/", fallback = ProductFallback.class)
public interface ProductServiceClient {

	@GetMapping(value="/product-api/users/{userId}/products")
    List<Product> getProductsByUserId(@PathVariable Long userId);
}