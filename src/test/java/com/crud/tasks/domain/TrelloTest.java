package com.crud.tasks.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 15/11/2017.
 */
public class TrelloTest {
    @Test
    public void shouldTestTrello() {
        //Given
        Trello trello = new Trello(1, 1);

        //When
        int trelloBoard = trello.getBoard();

        //Then
        assertEquals(1, trelloBoard);
    }
}
