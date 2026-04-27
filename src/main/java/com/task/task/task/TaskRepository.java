package com.task.task.task;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.task.task.task.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
}