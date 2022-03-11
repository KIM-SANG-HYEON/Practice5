package com.oracle.prac.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.prac.dto.Board;
import com.oracle.prac.service.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService bs;
	
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	
	//화면 목록 
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public String list(Board board , Model model) {
		
		log.info("*******BoardController list Start ********");
		
		
		List<Board> list = bs.list(board);  
		
		System.out.println("Controller list -> " +list);
		model.addAttribute("boardlist",list); 
		
		return "list";
	}
	
	//화면 작성하는 페이지 
	@RequestMapping(value = "/writeView" , method = RequestMethod.GET)
	public String writeView() {
		
		log.info("*****BoardController writeView Start.......******");
		
		return "writeView";
	}
	
	//게시글 작성 
	@RequestMapping(value = "/write" , method = RequestMethod.POST)
	public String write(Board board) {
		
		log.info("*****BoardController write Start.......******");
		
		bs.boardInsert(board);
		
		return "redirect:/list";
		
	}
	
	//게시글 상세 
	@RequestMapping(value = "/read" , method = RequestMethod.GET)
	public String read(Board board , Model model) {

		
		log.info("*****BoardController read Start.......******");

		Board board2 = bs.boardRead(board);
		log.info("****board2 ->"+board2.toString());
		
		model.addAttribute("read", board2);
		
		return "readView";
		
		
	}
}
