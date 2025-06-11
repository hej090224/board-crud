package com.example.board.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.crud.entity.Board;

@Repository
public interface BoardRepository  extends JpaRepository<Board,Long> {
}
