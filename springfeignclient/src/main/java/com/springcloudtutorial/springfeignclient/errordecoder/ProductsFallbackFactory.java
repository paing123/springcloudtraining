package com.springcloudtutorial.springfeignclient.errordecoder;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.springcloudtutorial.springfeignclient.feign.ProductServiceClient;

@Component
class ProductsFallbackFactory implements FallbackFactory<ProductServiceClient> {

    @Override
    public ProductServiceClient create(Throwable cause) {
        return new ProductFallback(cause);
    }
}
