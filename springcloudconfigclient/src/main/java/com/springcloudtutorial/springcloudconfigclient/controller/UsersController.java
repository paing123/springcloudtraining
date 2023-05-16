package com.springcloudtutorial.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
//	@Value("${token.secret}")
//    String token;
//	
//	@GetMapping("/check")
//    public String status() {
//        return "token => "+token;
//    }
}
