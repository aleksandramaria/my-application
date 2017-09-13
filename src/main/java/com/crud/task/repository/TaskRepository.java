package com.crud.task.repository;

import com.crud.tasks.domain.TaskDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TaskRepository extends CrudRepository<TaskDto, Long> {

    @Override
    List<TaskDto> findAll();

//    @Override
//    List<TaskDto> findById(String id);

}
