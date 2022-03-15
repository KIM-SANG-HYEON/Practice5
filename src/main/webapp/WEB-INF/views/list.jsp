<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./resources/css/board.css?ver=1">
<title>게시판 목록 보여주기 </title>
</head>
<body>



			<div class="post-info-list-pannel">
			<button onclick="location.href='./writeView'">게시판 작성</button>
				<div class="search">
					  <form action="./list">
						<select name="searchType">
						<option value="boardTitle" <c:if test = "${searchType eq 'boardTitle'}">selected</c:if>>제목</option>
						<option value="boardContent" <c:if test = "${searchType eq 'boardContent'}">selected</c:if>>내용</option>
						</select>
						<input type="text" id="keyword" name="keyword" value="${keyword}"placeholder="내용 또는 제목으로 검색">
						<input type="submit" value="검색" >
					  </form>
				</div>
				<table>
					<thead>
						<tr>
							<td>선택<input type="checkbox" id="allchk" name="allchk" ></td>
							<td>게시글 코드</td>
							<td>게시글 제목</td>
							<td>게시글 내용</td>
							<td>게시글 작성자</td>
							<td>게시글 날짜</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach items="${boardlist}" var="boardlist">
								<tr>
									<td><input type="checkbox" id="chk" name="chk" value="${boardlist.boardCode}"></td>
									<td>${boardlist.boardCode}</td>
									<td><a href="read?boardCode=${boardlist.boardCode}">${boardlist.boardTitle }</a></td>
									<td>${boardlist.boardContent}</td>
									<td>${boardlist.boardWriter}</td>
									<td>${boardlist.boardRegdate}</td>
							</c:forEach>
						</tr>
					</tbody>
				</table>
					<div class="paging-container">
				<div class="paging">
					<c:if test="${pg.startPage > pg.pageBlock }">
						<a href="./list?currentPage1=${pg.startPage-pg.pageBlock}${pg.searchTypeKeyword}">이전</a>
					</c:if>
					
					<c:forEach var="i" begin="${pg.startPage}" end="${pg.endPage}">
						<a href="./list?currentPage1=${i}">[${i}]</a>
					</c:forEach>
					
					<c:if test="${pg.endPage < pg.totalPage}">
						<a href="./list?currentPage1=${pg.startPage + pg.pageBlock}${pg.searchTypeKeyword}">다음</a>
					</c:if>
			 	</div>
		  </div>
		
			</div>
</body>
</html>