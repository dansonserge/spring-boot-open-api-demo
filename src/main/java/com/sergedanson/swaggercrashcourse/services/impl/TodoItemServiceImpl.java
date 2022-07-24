package com.sergedanson.swaggercrashcourse.services.impl;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import com.sergedanson.swaggercrashcourse.repositories.TodoItemRepository;
import com.sergedanson.swaggercrashcourse.services.TodoItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    TodoItemRepository todoItemRepository;
    TodoItemServiceImpl(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }

    @Override
    public ToDoItem createTodoItem(ToDoItem item) throws Exception {
        return todoItemRepository.save(item);
    }

    @Override
    public List<ToDoItem> getAllItems() throws Exception {
        return todoItemRepository.findAll();
    }

    @Override
    public void deleteTodoItem(ToDoItem item) throws Exception {
       todoItemRepository.delete(item);
    }

    @Override
    public ToDoItem findTodoItemById(Long id) throws Exception {
        return todoItemRepository.findById(id).orElse(new ToDoItem());
    }
}
