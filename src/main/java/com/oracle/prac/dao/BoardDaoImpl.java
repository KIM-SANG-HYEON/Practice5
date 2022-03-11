package com.oracle.prac.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.prac.dto.Board;

@Repository
public class BoardDaoImpl {
	
	@Autowired
	private SqlSession sqlsession;

	
	//화면 목록
	public List<Board> list(Board board) {
		
		System.out.println("BoardDaoImpl list Start......");
		
		return sqlsession.selectList("BoardList", board);
	}


	//게시글 작성 
	public void boardInsert(Board board) {


		System.out.println("BoardDaoImpl boardInsert Start......");
		
		sqlsession.insert("BoardInsert",board);
		
	}

	//게시글 상세 
	public Board boardRead(Board board) {


		System.out.println("BoardDaoImpl boardInsert Start......");
		
		return sqlsession.selectOne("BoardRead", board);
	}

}
