package com.example.board.crud.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.ui.Model;

import com.example.board.crud.service.BoardService;
import com.example.board.crud.dto.BoardRequestDto;

@Controller
@RequiredArgsConstructor

public class BoardViewController {

    private final BoardService boardService;

    @GetMapping("/board-list")
    public String boardList(Model model) {
        model.addAttribute("boards", boardService.findAllBoards());
        return "board-list";
    }

    @GetMapping("/boards/new")
    public String createBoardForm(Model model) {
        model.addAttribute("board", new BoardRequestDto());
        return "create";
    }

    @GetMapping("/boards/view/{id}")
    public String viewBoard(@PathVariable Long id, Model model) {
        model.addAttribute("board", boardService.findOneBoard(id));
        return "detail";
    }

    @GetMapping("/boards/edit/{id}")
    public String editBoardForm(@PathVariable Long id, Model model) {
        model.addAttribute("board", boardService.findOneBoard(id));
        return "edit";
    }
}

