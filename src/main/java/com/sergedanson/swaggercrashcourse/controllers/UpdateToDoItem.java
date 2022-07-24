package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.Activity;
import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateToDoItem {

    final
    TodoItemService todoItemService;

    public UpdateToDoItem(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }


    @PutMapping(value = "/todos")
    @Operation(
            tags = {"TodoItems"},
            operationId = "updateTodo",
            summary = "update todo",
            description = "this end point updates a todo",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description="Req body description",
                    content = @Content(schema = @Schema(implementation = ToDoItem.class))),
            responses = {@ApiResponse(
                    responseCode =  "200",
                    content = @Content(schema = @Schema(implementation = ToDoItem.class), mediaType = MediaType.APPLICATION_JSON_VALUE ),
                    description = "Success desc"
            )}
    )
    public ResponseEntity<Object> updateToDoItem(@RequestBody ToDoItem toDoItem) throws Exception {

        return ResponseEntity.ok().body(todoItemService.createTodoItem(toDoItem));
    }
}
