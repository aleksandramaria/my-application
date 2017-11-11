package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ola on 08/11/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TrelloMapperTest {
    @InjectMocks
    private TrelloMapper trelloMapper;

    @Test
    public void shouldMapToBoards() {
        //Given
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        List<TrelloBoardDto> trelloBoardDto = new ArrayList<>();
        TrelloBoardDto boardDto = new TrelloBoardDto("2", "number2", trelloListDto);
        trelloBoardDto.add(boardDto);

        List<TrelloList> trelloList = new ArrayList<>();
        List<TrelloBoard> expectedTrelloBoardList = new ArrayList<>();
        TrelloBoard board1 = new TrelloBoard("2", "number2", trelloList);
        expectedTrelloBoardList.add(board1);

        //When
        List<TrelloBoard> resultedTrelloBoardList = trelloMapper.mapToBoards(trelloBoardDto);

        //Then
        assertEquals(expectedTrelloBoardList.size(), resultedTrelloBoardList.size());
        assertEquals(expectedTrelloBoardList.get(0).getId(), resultedTrelloBoardList.get(0).getId());
        assertEquals(expectedTrelloBoardList.get(0).getName(), resultedTrelloBoardList.get(0).getName());
        assertEquals(expectedTrelloBoardList.get(0).getLists(), resultedTrelloBoardList.get(0).getLists());
    }

    @Test
    public void shouldMapToBoardsDto() {
        //Given
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        List<TrelloBoardDto> trelloBoardDto = new ArrayList<>();
        TrelloBoardDto boardDto = new TrelloBoardDto("2", "number2", trelloListDto);
        trelloBoardDto.add(boardDto);

        List<TrelloList> trelloList = new ArrayList<>();
        List<TrelloBoard> trelloBoard = new ArrayList<>();
        TrelloBoard board = new TrelloBoard("2", "number2", trelloList);
        trelloBoard.add(board);

        //When
        List<TrelloBoardDto> resultedTrelloBoardDtoList = trelloMapper.mapToBoardsDto(trelloBoard);

        //Then
        assertEquals(trelloBoardDto.size(), resultedTrelloBoardDtoList.size());
        assertEquals(trelloBoardDto.get(0).getId(), resultedTrelloBoardDtoList.get(0).getId());
        assertEquals(trelloBoardDto.get(0).getName(), resultedTrelloBoardDtoList.get(0).getName());
    }

    @Test
    public void shouldMapToList() {
        //Given
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        List<TrelloBoardDto> trelloBoardDto = new ArrayList<>();
        TrelloBoardDto boardDto = new TrelloBoardDto("2", "number2", trelloListDto);
        trelloBoardDto.add(boardDto);

        List<TrelloList> trelloList = new ArrayList<>();
        List<TrelloBoard> trelloBoard = new ArrayList<>();
        TrelloBoard board1 = new TrelloBoard("2", "number2", trelloList);
        trelloBoard.add(board1);

        //When
        List<TrelloList> resultedTrelloList = trelloMapper.mapToList(trelloListDto);

        //Then
        assertEquals(trelloList.size(), resultedTrelloList.size());
    }

    @Test
    public void shouldMapToListDto() {
        //Given
        List<TrelloListDto> trelloListDto = new ArrayList<>();
        List<TrelloBoardDto> trelloBoardDto = new ArrayList<>();
        TrelloBoardDto boardDto = new TrelloBoardDto("2", "number2", trelloListDto);
        trelloBoardDto.add(boardDto);

        List<TrelloList> trelloList = new ArrayList<>();
        List<TrelloBoard> trelloBoard = new ArrayList<>();
        TrelloBoard board = new TrelloBoard("2", "number2", trelloList);
        trelloBoard.add(board);

        //When
        List<TrelloListDto> resultedTrelloListDto = trelloMapper.mapToListDto(trelloList);

        //Then
        assertEquals(trelloListDto.size(), resultedTrelloListDto.size());
        assertEquals(0, resultedTrelloListDto.size());
    }

    @Test
    public void shouldMapToCardDto() {
        //Given
        TrelloCard trelloCard = new TrelloCard("new card", "new", "inside", "1");

        //When
        TrelloCardDto resultedTrelloCardDto = trelloMapper.mapToCardDto(trelloCard);

        //Then
        assertEquals(trelloCard.getDescription(), resultedTrelloCardDto.getDescription());

    }

    @Test
    public void shouldMapToCard() {
        //Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("new card", "new", "inside", "1");

        //When
        TrelloCard resultedTrelloCard = trelloMapper.mapToCard(trelloCardDto);

        //Then
        assertEquals(trelloCardDto.getDescription(), resultedTrelloCard.getDescription());
        assertEquals(trelloCardDto.getListId(), resultedTrelloCard.getListId());
    }
}



