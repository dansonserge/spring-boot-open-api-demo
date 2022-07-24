package com.sergedanson.swaggercrashcourse.repositories;

import com.sergedanson.swaggercrashcourse.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoItemRepository extends JpaRepository<ToDoItem, Long> {

}
