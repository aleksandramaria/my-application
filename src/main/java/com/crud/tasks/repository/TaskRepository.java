package com.crud.tasks.repository;

import com.crud.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

    @Override
    List<Task> findAll();

    @Override
    Optional<Task> findById(final Long id);

    @Override
    Task save(final Task task);

//    @Override
    Task deleteTaskById(final Long id);

//    Optional<Task> deleteTaskById(final Long id);

}
