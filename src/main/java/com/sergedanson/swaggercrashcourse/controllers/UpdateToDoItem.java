package com.sergedanson.swaggercrashcourse.controllers;

import com.sergedanson.swaggercrashcourse.models.Activity;
import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateToDoItem {
    @PutMapping(value = "/todos/{toDoItemId}")
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
    public ResponseEntity<Object> updateToDoItem(@PathVariable String toDoItemId,
                                                 @RequestBody ToDoItem toDoItem,
                                                 @CookieValue(required = false) String canEdit,
                                                 @RequestHeader Boolean fromHost,
                                                 @RequestParam Boolean isClient) {

        return ResponseEntity.ok().body(toDoItem);
    }
}
