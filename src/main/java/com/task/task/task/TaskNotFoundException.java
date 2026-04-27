package com.task.task.task;

public class TaskNotFoundException extends RuntimeException{
    
    public TaskNotFoundException(Long id)
    {
        super("Task Not found with id: "+ id);
    }
}