package com.kyeljmd.examples.model;

import com.kyeljmd.examples.TodoDTO;
import com.kyeljmd.examples.Util;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by kyel on 2/5/2017.
 */
@Entity
@Table
public class Todo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime dateCreated = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public TodoDTO toDTO() {
        return new TodoDTO(getDescription(),getTitle(), Util.toReadableDateTime(getDateCreated()));
    }
}
