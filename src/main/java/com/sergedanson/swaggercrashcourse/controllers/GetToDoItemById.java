package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetToDoItemById {


    TodoItemService todoItemService;

    public GetToDoItemById(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }


    @GetMapping(value = "/todos/{toDoItemId}")
    @Operation(
            tags = {"TodoItems"}
    )
    public ResponseEntity<Object> getToDoItemById(@PathVariable Long toDoItemId) throws Exception{

        return ResponseEntity.ok().body(todoItemService.findTodoItemById(toDoItemId));
    }
}
