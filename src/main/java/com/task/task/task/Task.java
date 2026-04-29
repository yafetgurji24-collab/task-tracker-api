package com.task.task.task;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
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

    public Long getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    public LocalDateTime getCreatedAtTime()
    {
        return createdAt;
    }

    public LocalDateTime getUpdatedAtTime()
    {
        return updatedAt;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setDescription(String newDiscription)
    {
        this.description=newDescription;
    }

    public void setStatus(Status newStatus)
    {
        this.status=newStatus;
    }
}