<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="./resources/css/board.css?ver=1">
<title>게시판 수정</title>
</head>
<script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='updateForm']");
			
			$(".cancel_btn").on("click", function(){
				event.preventDefault();
				location.href = "/list";
			})

			// 수정 
			$(".update_btn").on("click", function(){
			formObj.attr("action", "/update");
			formObj.attr("method", "post");
			formObj.submit();				
	})

			})
	
	</script>		
<body>
			
		<div class="post-info-list-pannel">
			<div class="daily-history-title-pannel">
					<h3>게 시 판 수 정</h3>
			</div>
				<form action="./update" method="POST" role="form" name="updateForm">
					<input type="hidden" name="boardCode" value="${update.boardCode}" readonly="readonly" />
					<table>
						<tbody>
						
							<tr>
								<td><label for="boardTitle">제목</label>
								<td><label for="boardTitle"><input type="text" name="boardTitle" id="boardTitle" value="${update.boardTitle}"></label>
								
							</tr>
							<tr>
								<td><label for="boardContent">내용</label>
								<td width="800px;"><label for="boardContent"><input type="text" name="boardContent" id="boardContent" value="${update.boardContent}"></label>
								
							</tr>
							<tr>
								<td><label for="boardWriter">작성자</label>
								<td width="800px;"><label for="boardWriter"><input type="text" name="boardWriter" id="boardWriter" value="${update.boardWriter}"></label>
								</td>
							</tr>
							<tr>
								<td><label for="boardRegdate">작성날짜</label>
								<td width="800px;"><label for="boardRegdate"><input type="date" name="boardRegdate" id="boardRegdate" value="${update.boardRegdate}"></label></td>
							</tr>
						</tbody>
					</table>
						<div>
							<button type="submit" class="update_btn">저장</button>
							<button type="submit" class="cancel_btn">취소</button>
					</div>
				</form>
		</div>
		

	
</body>
</html>