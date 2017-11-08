//package com.crud.tasks.controller;
//
//import com.crud.tasks.domain.*;
//import com.crud.tasks.mapper.TaskMapper;
//import com.crud.tasks.service.DbService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentMatchers;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.is;
//import static org.mockito.ArgumentMatchers.anyList;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
///**
// * Created by ola on 06/11/2017.
// */
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(TaskController.class)
//public class TaskControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DbService service;
//
//    @MockBean
//    private TaskMapper taskMapper;
//
//    @Test
//    public void shouldFetchTasks() throws Exception {
//        //Given
//        List<TaskDto> taskList = new ArrayList<>();
//        taskList.add(new TaskDto(new Long(1), "course", "test coverage"));
//
//        when(taskMapper.mapToTaskDtoList(anyList())).thenReturn(taskList);
//
//        //When & Then
//        mockMvc.perform(get("/v1/task/getTasks").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().is(200))
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].title", is("course")));
//    }
//
//    @Test
//    public void shouldFetchOneTask() throws Exception {
//        //Given
//        List<TaskDto> taskList = new ArrayList<>();
//        taskList.add(new TaskDto(new Long(2), "kodilla course", "task to be tested"));
//
//        when(service.getTaskById()).thenReturn();
//        when(taskMapper.mapToTaskDto()).thenReturn();
//
//        //When & Then
//        mockMvc.perform(get("/v1/task/getTask").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().is(200))
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].id", is(2)))
//                .andExpect(jsonPath("$[0].title", is("kodilla course")))
//                .andExpect(jsonPath("$[0].content", is("task to be tested")));
//    }
//
//    @Test
//    public void shouldDeleteTask() throws Exception {
//        //Given
//        List<TaskDto> taskList = new ArrayList<>();
//        TaskDto taskDto1 = new TaskDto(new Long(1), "course1", "test1");
//        TaskDto taskDto2 = new TaskDto(new Long(2), "course2", "test2");
//        taskList.add(taskDto1);
//        taskList.add(taskDto2);
//
//        when(service.deleteTask(taskDto2.getId()).thenReturn(taskList));
//
//        //When & Then
//        mockMvc.perform(get("/v1/task/deleteTask").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().is(200))
//                .andExpect(jsonPath("$", hasSize(1)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].title", is("course1")))
//                .andExpect(jsonPath("$[0].content", is("test1")));
//    }
//
//    @Test
//    public void shouldUpdateTask() throws Exception {
//        //Given
//
//        //When & Then
//    }
//
//    @Test
//    public void shouldCreateTask() throws Exception {
//        //Given
//
//        //When & Then
//    }
//}
//
////    when(trelloService.fetchTrelloBoards()).thenReturn(trelloBoards);
////        when(trelloMapper.mapToBoards(trelloBoards)).thenReturn(mappedTrelloBoards);
////        when(trelloMapper.mapToBoardsDto(anyList())).thenReturn(trelloBoards);
////        when(trelloValidator.validateTrelloBoards(mappedTrelloBoards)).thenReturn(mappedTrelloBoards);