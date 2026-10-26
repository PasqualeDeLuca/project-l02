package com.example.project_l02.task;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        return List.of(
            new Task(1L, "Studiare Java", true),
            new Task(2L, "Imparare Spring Boot", false),
            new Task(3L, "Creare una REST API", false)
        );
    }
}