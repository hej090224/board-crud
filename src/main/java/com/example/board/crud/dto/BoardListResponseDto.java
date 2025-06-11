package com.example.board.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


import com.example.board.crud.entity.Board;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardListResponseDto {

    private String title;
    private String content;

    public BoardListResponseDto(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}