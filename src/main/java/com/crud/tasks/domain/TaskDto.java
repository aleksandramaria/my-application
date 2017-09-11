package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by ola on 11/09/2017.
 */
@Getter
@AllArgsConstructor
public class TaskDto {
    private String id;
    private String title;
    private String content;
}
