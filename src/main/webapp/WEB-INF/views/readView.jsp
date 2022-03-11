<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="./resources/css/board.css?ver=1">
<title>게시판 조회</title>
</head>
<body>



			<div class="post-info-list-pannel">
				<div class="daily-history-title-pannel">
					<h3>게 시 글 조 회</h3>
				</div>
					<form name="readForm" role="form" method="post">
						<input type="hidden" id="boardCode" name="boardCode" value="${read.boardCode}" />
					   </form>
					<table>
						<tbody>
						
							<tr>
								<td><label for="boardTitle">제목</label>
								<td><label for="boardTitle">${read.boardTitle}</label>
								
							</tr>
							<tr>
								<td><label for="boardContent">내용</label>
								<td width="800px;"><label for="boardContent">${read.boardContent}</label>
								
							</tr>
							<tr>
								<td><label for="boardWriter">작성자</label>
								<td width="800px;"><label for="boardWriter">${read.boardWriter}</label>
								</td>
							</tr>
							<tr>
								<td><label for="boardRegdate">작성날짜</label>
								<td width="800px;"><label for="boardRegdate">${read.boardRegdate}</label></td>
							</tr>
						</tbody>
					</table>
	
						<div>
							<button type="submit" class="update_btn">수정</button>
							<button type="submit" class="delete_btn">삭제</button>
							<button type="submit" class="list_btn">목록</button>	
					    </div>
					   
				</div>



<script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='readForm']");
			
			// 수정 
			$(".update_btn").on("click", function(){
				formObj.attr("action", "/updateView");
				formObj.attr("method", "get");
				formObj.submit();				
			})
			
			// 삭제
			$(".delete_btn").on("click", function(){
				formObj.attr("action", "./delete");
				formObj.attr("method", "post");
				formObj.submit();
			})
			
			// 취소
			$(".list_btn").on("click", function(){
				
				location.href = "/list";
			})
		})
	</script>	
</body>
</html>