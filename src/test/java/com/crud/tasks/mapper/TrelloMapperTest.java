package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import com.crud.tasks.service.TrelloService;
import com.crud.tasks.trello.facade.TrelloFacade;
import com.crud.tasks.trello.validator.TrelloValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by ola on 08/11/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TrelloMapperTest {
    @InjectMocks
    private TrelloMapper trelloMapper;

    @Mock
    private TrelloFacade trelloFacade;

    @Mock
    private TrelloService trelloService;

    @Mock
    private TrelloValidator trelloValidator;

    @Test
    public void shouldMapToBoards() {
        //Given
        List<TrelloList> trelloList = new ArrayList<>();
        List<TrelloListDto> trelloListDto = new ArrayList<>();

        List<TrelloBoard> trelloBoards = new ArrayList<>();
        List<TrelloBoardDto> trelloBoardDto = new ArrayList<>();

        TrelloBoard board1 = new TrelloBoard("1", "number1", trelloList);
        trelloBoards.add(board1);

        TrelloBoardDto boardDto = new TrelloBoardDto("2", "number2", trelloListDto);
        trelloBoardDto.add(boardDto);

//        when(trelloMapper.mapToBoards(trelloBoardDto)).thenReturn(trelloBoards);

        //When
        List<TrelloBoard> anotherBoardDto = trelloMapper.mapToBoards(trelloBoardDto);

        //Then
        assertEquals(1, anotherBoardDto.size());
    }

}

//    public List<TrelloBoard> mapToBoards(final List<TrelloBoardDto> trelloBoardDto) {
//        return trelloBoardDto.stream()
//                .map(trelloBoard ->
//                        new TrelloBoard(trelloBoard.getId(), trelloBoard.getName(), mapToList(trelloBoard.getLists())))
//                .collect(toList());