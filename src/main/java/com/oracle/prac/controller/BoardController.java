package com.oracle.prac.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.prac.dto.Board;
import com.oracle.prac.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService bs;
	
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	
	//화면 보여주기 
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public String list(Board board) {
		
		log.info("*******BoardController list Start ********");
		
		return "list";
	}
	
	//
	
}
