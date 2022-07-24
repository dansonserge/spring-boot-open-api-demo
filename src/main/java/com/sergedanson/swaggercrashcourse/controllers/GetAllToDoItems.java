package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetAllToDoItems {


    TodoItemService todoItemService;

    public GetAllToDoItems(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping(value = "todos")
    @Operation(
            tags = {"TodoItems"}
    )
    public ResponseEntity<Object> getAllToDoItems(Boolean isCompleted) throws Exception{
        List<ToDoItem> toDoItems = todoItemService.getAllItems();
        return ResponseEntity.ok().body(toDoItems);
    }
}
