package com.oracle.prac.dto;

public class Paging {

	private int currentPage = 1; //현재 페이지 
	private int rowPage = 10; //한 페이지에 표시할 데이터 
	private int pageBlock = 10; //한 블록에 몇 페이지가 속해있는지 
	private int start;
	private int end;
	private int startPage;
	private int endPage;
	private int total;
	private int totalPage;
	private String searchTypeKeyword;
	public Paging(int total, String currentPage1) {
		
		this.total = total;
		if(currentPage1 == null) {
			this.currentPage = 1;
		} else {
			this.currentPage = Integer.parseInt(currentPage1);
		}
		
		start = (currentPage -1)*rowPage +1; // 시작시 1
		end = start + rowPage -1; // 5
		totalPage = (int) Math.ceil((double)total / rowPage); // 2
		startPage = currentPage - (currentPage - 1) % pageBlock; // 1
		endPage = startPage + pageBlock -1;
		if(endPage > totalPage) {
			endPage = totalPage;
		}
				
	}


	public void setSearchTypeKeyword(String searchType, String keyword) {
		 
		 if(searchType.equals("") || keyword.equals("")) {
		  searchTypeKeyword = ""; 
		 } else {
		  searchTypeKeyword = "&searchType=" + searchType + "&keyword=" + keyword; 
		 }  
		}

		public String getSearchTypeKeyword() {
		 return searchTypeKeyword;
		}
	
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getRowPage() {
		return rowPage;
	}
	public void setRowPage(int rowPage) {
		this.rowPage = rowPage;
	}
	public int getPageBlock() {
		return pageBlock;
	}
	public void setPageBlock(int pageBlock) {
		this.pageBlock = pageBlock;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	
	
	
	
}
