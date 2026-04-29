package com.task.task.task;

import com.task.task.task.TaskService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
@RequestMapping("/task")
public class TaskController{
    
    @Autowired
    TaskService service;

    @GetMapping
    public List< Task > getAll()
    {
        return service.findTheAll();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id)
    {
        return service.findTheOne(id);
    }

    @PostMapping
    public Task addOne(@RequestBody Task task )
    {
        return service.addTheOne(task);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id)
    {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Task updateTheTask(@PathVariable Long id,@RequestBody Task updatedTask)
    {
        return service.updateTask(id,updatedTask);
    }
}