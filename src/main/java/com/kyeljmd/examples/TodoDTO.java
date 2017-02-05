package com.kyeljmd.examples;

import com.kyeljmd.examples.model.Todo;

import java.time.LocalDateTime;

/**
 * Created by kyel on 2/5/2017.
 */
public class TodoDTO {

    private String description;

    private String title;

    private String dateCreated;

    public TodoDTO() {
    }

    public TodoDTO(String description, String title, String dateCreated) {
        this.description = description;
        this.title = title;
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Todo toModel() {
        Todo todo = new Todo();
        LocalDateTime dateCreated = this.getDateCreated() != null ? LocalDateTime.parse(getDateCreated(),Util.formatter) : LocalDateTime.now();
        todo.setDateCreated(dateCreated);
        todo.setTitle(getTitle());
        todo.setDescription(getDescription());
        return todo;
    }
}
