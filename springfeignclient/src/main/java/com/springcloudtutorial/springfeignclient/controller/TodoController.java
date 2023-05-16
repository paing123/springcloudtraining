package com.springcloudtutorial.springfeignclient.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.KeyStore;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloudtutorial.springfeignclient.feign.TodoClient;
import com.springcloudtutorial.springfeignclient.model.TodoModel;

@RestController
public class TodoController {
    
    @Autowired
    TodoClient todoClient;
    
    @GetMapping("/todos")
    public List<TodoModel> getTodos()
    {
        return todoClient.getTodos();
    } 
}
