package com.example.board.crud.controller;


import com.example.board.crud.dto.BoardListResponseDto;
import com.example.board.crud.dto.BoardRequestDto;
import com.example.board.crud.dto.BoardResponseDto;
import com.example.board.crud.entity.Board;
import com.example.board.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/boards")
    public Board createBoard(@RequestBody BoardRequestDto requestDto) {
        return boardService.createBoard(requestDto);
    }

    @GetMapping("/boards")                                      //null 나오는거 고치기
    public List<BoardListResponseDto> getAllBoards() {
        return boardService.findAllBoards();
    }

    @GetMapping("/boards/{id}")
    public BoardResponseDto getOneBoard(@PathVariable long id) {
        return boardService.findOneBoard(id);
    }

    @PutMapping("/{id}")
    public BoardResponseDto updateBoard(@PathVariable long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }

    @DeleteMapping("/boards/{id}")
    public Long deleteBoard(@PathVariable long id) {
        return boardService.deleteBoard(id);
    }

    @GetMapping("/boards/check/{id}/{inputPassword}")
    public boolean checkPassword(@PathVariable long id, @PathVariable String inputPassword) {
        return boardService.checkPassword(id, inputPassword);
    }


}
