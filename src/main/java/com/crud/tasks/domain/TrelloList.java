package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by ola on 31/10/2017.
 */
@Getter
@AllArgsConstructor
public class TrelloList {
    private String id;
    private String name;
    private boolean isClosed;
}
