package com.sergedanson.swaggercrashcourse.services;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;

import java.util.List;

public interface TodoItemService {

    ToDoItem createTodoItem(ToDoItem item) throws Exception;
    List<ToDoItem> getAllItems() throws Exception;

    void deleteTodoItem(ToDoItem item) throws Exception;

    ToDoItem findTodoItemById(Long id) throws Exception;

}
