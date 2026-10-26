package com.example.project_l02.task;

public record Task(
    Long id,
    String title,
    boolean completed
) {}