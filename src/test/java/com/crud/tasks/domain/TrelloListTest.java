package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 15/11/2017.
 */
public class TrelloListTest {

    @Test
    public void shouldTestTrelloList() {
        //Given
        TrelloList trelloList = new TrelloList("1", "my name", true);

        //When
        String trelloId = trelloList.getId();

        //Then
        assertEquals("1", trelloId);
    }
}
