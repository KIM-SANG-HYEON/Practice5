package com.oracle.prac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.prac.dao.BoardDaoImpl;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDaoImpl bd;
}
