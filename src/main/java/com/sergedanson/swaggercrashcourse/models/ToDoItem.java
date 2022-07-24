package com.sergedanson.swaggercrashcourse.models;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "todo_items")
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String title;
    private String description;
    private Boolean completed;

}
