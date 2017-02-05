package com.kyeljmd.examples.controller;

import com.kyeljmd.examples.TodoDTO;
import com.kyeljmd.examples.Util;
import com.kyeljmd.examples.model.Todo;
import com.kyeljmd.examples.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyel on 2/5/2017.
 */
@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<TodoDTO> get(){
        List<TodoDTO> todos = new ArrayList<>();

        todoRepository.
                findAll()
                .forEach(todo -> todos.add(todo.toDTO()));

        return todos;
    }

    @PostMapping("/add")
    public Todo save(@RequestBody TodoDTO todo) {
        return todoRepository.save(todo.toModel());
    }

}
