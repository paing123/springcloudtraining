package com.springcloudtutorial.springfeignclient.feign;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloudtutorial.springfeignclient.model.Product;
import com.springcloudtutorial.springfeignclient.model.TodoModel;

@FeignClient(name="product-service", url="http://localhost:57907")
public interface ProductServiceClient {

	@GetMapping(value="/product-api/users/{userId}/products")
    List<Product> getProductsByUserId(@PathVariable Long userId);
}