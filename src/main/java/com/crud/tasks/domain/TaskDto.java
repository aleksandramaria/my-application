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
@NoArgsConstructor
@Entity(name = "tasks")
public class TaskDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "name")
    private String title;

    @Column(name = "description")
    private String content;
}
