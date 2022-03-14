package com.oracle.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.prac.dao.BoardDaoImpl;
import com.oracle.prac.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDaoImpl bd;

	
	//화면 목록
	@Override
	public List<Board> list(Board board) {


		System.out.println("BoardServiceImpl list Start.......");
		
		return bd.list(board);
	}


	//게시글 작성
	@Override
	public void boardInsert(Board board) {


		System.out.println("BoardServiceImpl boardInsert Start.......");
		
		bd.boardInsert(board);
		
	}

	//게시글 상세 
	@Override
	public Board boardRead(Board board) {


		System.out.println("BoardServiceImpl boardRead Start.......");
		
		return bd.boardRead(board);
	}

	//게시글 수정 
	@Override
	public void boardUpdate(Board board) {


		System.out.println("BoardServiceImpl boardUpdate Start.......");
		
		bd.boardUpdate(board);
		
	}

	//게시글 삭제
	@Override
	public void BoardDelete(Board board) {


		System.out.println("BoardServiceImpl BoardDelete Start.......");
		
		bd.boardDelete(board);
	}
}
