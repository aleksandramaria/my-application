package com.crud.tasks.service;

import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by ola on 15/11/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class DbServiceTest {
    @InjectMocks
    private DbService dbService;

    @Mock
    private TaskRepository repository;

    @Test
    public void shouldSaveTask() {
        //Given
        Task task1 = new Task(new Long(1), "title", "content");
        when(repository.save(any(Task.class))).thenReturn(task1);

        //When
        Task resultTask = repository.save(task1);

        //Then
        assertEquals(task1.getId(), resultTask.getId());
    }

    @Test
    public void shouldGetAllTasks() {
        //Given
        Task task1 = new Task(new Long(1), "a", "l");
        Task task2 = new Task(new Long(2), "b", "m");
        Task task3 = new Task(new Long(3), "c", "n");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        when(repository.findAll()).thenReturn(taskList);

        //When
        List<Task> resultedTaskList = repository.findAll();

        //Then
        assertEquals(taskList.size(), resultedTaskList.size());
    }

    @Test
    public void shouldGetAllTasks1() {
        //Given
        List<Task> taskList = new ArrayList<>();
        when(repository.findAll()).thenReturn(taskList);

        //When
        List<Task> resultedTaskList = repository.findAll();

        //Then
        assertEquals(taskList.size(), resultedTaskList.size());
    }

    @Test
    public void shouldGetTaskById() {
        //Given
        Optional<Task> task = Optional.of(new Task(2L, "n", "n"));
        when(repository.findById(any(Long.class))).thenReturn(task);

        //When
        Optional<Task> resultTask = repository.findById(2L);

        //Then
        assertEquals(resultTask, task);
    }
}
