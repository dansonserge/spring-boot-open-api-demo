package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateToDoItem {

        final
        TodoItemService todoItemService;

        public CreateToDoItem(TodoItemService todoItemService) {
                this.todoItemService = todoItemService;
        }


        @PostMapping(value = "/todos")
        @Operation(
                tags = {"TodoItems"}
        )
        public ResponseEntity<Object> createToDoItem(@RequestBody ToDoItem toDoItem)  throws Exception{
                ToDoItem item = todoItemService.createTodoItem(toDoItem);
                return ResponseEntity.ok().body(item);
        }
}
