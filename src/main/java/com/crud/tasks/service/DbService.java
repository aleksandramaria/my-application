package com.crud.tasks.service;

import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ola on 13/09/2017.
 */
@Service
public class DbService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskDto> getAllTasks() {
        return new ArrayList<>();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }
}
