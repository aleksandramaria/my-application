package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by ola on 11/09/2017.
 */
@Getter
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String title;
    private String content;
}
