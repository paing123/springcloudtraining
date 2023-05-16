package com.springcloudtutorial.springcloudconfigclient.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloudtutorial.springcloudconfigclient.model.TodoModel;

@RestController
public class TodoController {
    
	@GetMapping("/todosdata")
    public List<TodoModel> getTodoData()
    {
        TodoModel todoModel1 = new TodoModel("1", 1, "delectus aut autem1", false);
        TodoModel todoModel2 = new TodoModel("1", 2, "delectus aut autem2", true);
        TodoModel todoModel3 = new TodoModel("1", 3, "delectus aut autem3", false);
        TodoModel todoModel4 = new TodoModel("1", 4, "delectus aut autem4", true);
        
        List<TodoModel> todoList = new ArrayList<>(Arrays.asList(todoModel1,todoModel2,todoModel3,todoModel4));
        return todoList;
    }
    
}
