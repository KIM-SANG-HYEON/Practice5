package com.oracle.prac.service;

import java.util.List;

import com.oracle.prac.dto.Board;

public interface BoardService {

	List<Board> list(Board board); //화면 목록 

	void boardInsert(Board board); //게시글 작성 

	Board boardRead(Board board); //게시글 상세 

}
