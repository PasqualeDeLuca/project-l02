package com.example.project_l02.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository 
    extends JpaRepository<Task, Long> {

}

