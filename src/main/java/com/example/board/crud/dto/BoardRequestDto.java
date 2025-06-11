package com.example.board.crud.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter //@Setter 쓰는 거 맞는지 물어보기
@Setter
public class BoardRequestDto {

    private String title;

    private String content;

    private String password;
}
