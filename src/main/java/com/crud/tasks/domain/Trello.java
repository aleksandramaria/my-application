package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trello {
    private int board;
    private int card;
}
