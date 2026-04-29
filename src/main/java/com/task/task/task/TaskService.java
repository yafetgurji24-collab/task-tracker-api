package com.task.task.task;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TaskService{
    @Autowired
    TaskRepository repo;

    public List< Task > findTheAll()
    {
        return repo.findAll();
    }

    public Task findTheOne(Long id)
    {
        return repo.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
    }


    public Task addTheOne(Task task)
    {
        return repo.save(task);
    }

    public void delete(Long id)
    {
        if(!repo.existsById(id))
        {
            throw new TaskNotFoundException(id);
        }
        
        repo.deleteById(id);
    }
 
    public Task updateTask(Long id,Task updatedTask)
    {
        Task task = repo.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        task.setStatus(updatedTask.getStatus());
        task.setDescription(updatedTask.getDescription());
        return repo.save(task);
    }
    
}