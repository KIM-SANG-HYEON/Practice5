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
		
			</div>
</body>
</html>