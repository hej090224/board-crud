package com.example.board.crud.dto;

import com.example.board.crud.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class BoardResponseDto {

private String title;
private String content;

public BoardResponseDto(Board board) {
    this.title = board.getTitle();
    this.content = board.getContent();
    }
}
