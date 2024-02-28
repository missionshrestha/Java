package com.example.ToDo.controllers;

import com.example.ToDo.models.Todo;
import com.example.ToDo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;


//    create todo

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){

        return todoService.create(todo);
    }

    //  get all todo
    @GetMapping
    public List<Todo> getAll(){
        return todoService.getList();

    }

}


