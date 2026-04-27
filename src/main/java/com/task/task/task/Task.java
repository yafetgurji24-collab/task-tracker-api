package com.task.task.task;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Status status;
    public Task(){}

    @PrePersist
    protected void createdOn()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void updatedOn()
    {
        updatedAt = LocalDateTime.now();
    }
}