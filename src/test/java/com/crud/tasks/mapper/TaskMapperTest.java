package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 15/11/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TaskMapperTest {
    @InjectMocks
    private TaskMapper taskMapper;

    @Test
    public void shouldMapToTask() {
        //Given
        TaskDto taskDto = new TaskDto(new Long(1), "title", "content");

        //When
        Task resultedTask = taskMapper.mapToTask(taskDto);

        //Then
        assertEquals(taskDto.getId(), resultedTask.getId());
    }

    @Test
    public void shouldMapToTaskDto() {
        //Given
        Task task = new Task(new Long(2), "my title", "my content");

        //When
        TaskDto resultedTaskDto = taskMapper.mapToTaskDto(task);

        //Then
        assertEquals(task.getTitle(), resultedTaskDto.getTitle());
        assertEquals(task.getId(), resultedTaskDto.getId());
    }

    @Test
    public void shouldMapToTaskDtoList() {
        //Given
        List<Task> list = new ArrayList<>();

        //When
        List<TaskDto> resultedList = taskMapper.mapToTaskDtoList(list);

        //Then
        assertEquals(list.size(), resultedList.size());
    }
}


//    //Given
//    TrelloCardDto trelloCardDto = new TrelloCardDto("new card", "new", "inside", "1");
//
//    //When
//    TrelloCard resultedTrelloCard = trelloMapper.mapToCard(trelloCardDto);
//
//    //Then
//    assertEquals(trelloCardDto.getDescription(), resultedTrelloCard.getDescription());
//        assertEquals(trelloCardDto.getListId(), resultedTrelloCard.getListId());