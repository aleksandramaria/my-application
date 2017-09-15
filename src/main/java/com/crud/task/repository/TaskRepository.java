package com.crud.task.repository;

import com.crud.tasks.domain.TaskDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface TaskRepository extends CrudRepository<TaskDto, Long> {

    @Override
    List<TaskDto> findAll();

    @Override
    Optional<TaskDto> findById(Long id);

}
