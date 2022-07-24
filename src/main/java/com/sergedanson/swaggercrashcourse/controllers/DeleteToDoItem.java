package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteToDoItem {


    TodoItemService todoItemService;

    public DeleteToDoItem(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @DeleteMapping(value = "/todos/{toDoItemId}")
    @Operation(
            tags = {"TodoItems"}
    )
    public ResponseEntity<Object> deleteToDoItem(@PathVariable Long toDoItemId) throws Exception{

        ToDoItem item = todoItemService.findTodoItemById(toDoItemId);

        todoItemService.deleteTodoItem(item);

        return ResponseEntity.ok().body("ToDo Item Deleted");
    }
}
