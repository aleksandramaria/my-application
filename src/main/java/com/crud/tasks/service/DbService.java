package com.crud.tasks.service;

import com.crud.task.repository.TaskRepository;
import com.crud.tasks.domain.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ola on 13/09/2017.
 */
@Service
public class DbService {

    @Autowired
    private TaskRepository repository;

    public List<TaskDto> getAllTasks() {
        return repository.findAll();
    }

//    public List<TaskDto> getTaskById() {
//        return repository.findById();
//    }
}
