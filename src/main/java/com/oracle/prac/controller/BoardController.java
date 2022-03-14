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
	
	//게시글 수정하는 페이지
	@RequestMapping(value = "/updateView" , method = RequestMethod.GET)
	public String updateView(Board board , Model model) {
		
		log.info("*****BoardController updateView Start.......******");
		
		Board board2 = bs.boardRead(board);
		model.addAttribute("update", board2);
		
		return "updateView";

	}
	//게시글 수정	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String update(Board board) {
		
		log.info("*****BoardController updateView Start.......******");
		
		bs.boardUpdate(board);
		
		System.out.println("Board 값 넘어오는지 확인 --->" + board.getBoardContent());
		System.out.println("Board 값 넘어오는지 확인 --->" + board.getBoardTitle());
		
		
		return "redirect:/list";
		
	}
	
	//게시판 삭제 
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	public String delete(Board board) {
		
		
		log.info("*****BoardController delete Start.......******");
		
		bs.BoardDelete(board);
		
		return "redirect:/list";
	}
		
	
}
