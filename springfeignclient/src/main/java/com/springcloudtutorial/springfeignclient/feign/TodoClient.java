package com.springcloudtutorial.springfeignclient.feign;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.springcloudtutorial.springfeignclient.model.TodoModel;

@FeignClient(name="TodoClient", url="http://localhost:8080")
public interface TodoClient {

	@GetMapping(value="/todosdata",consumes=MediaType.APPLICATION_JSON_VALUE)
    List<TodoModel> getTodos();
}