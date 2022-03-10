<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./resources/css/board.css?ver=1">
<title>게시글 작성 </title>
</head>
<body>




			<div class="post-info-list-pannel">
			<div class="daily-history-title-pannel">
					<h3>게 시 판 작 성</h3>
			</div>
				<form action="./write" method="POST">
					<table class="tb_write">   	
       					<tbody>
			   				 <tr>
			        			<th scope="row"><label for="boardTitle"> 제목 </label></th>
			       				 <td><input type="text" name="boardTitle" id="boardTitle" style="width:100%"/></td>
			   			     </tr>
			   			     <tr>
			        			<th scope="row"><label for="boardContent"> 내용 </label></th>
			       				 <td><input type="text" name="boardContent" id="boardContent" style="width:100%"/></td>
			   			     </tr>
			   			     <tr>
			        			<th scope="row"><label for="boardWriter"> 작성자 </label></th>
			       				 <td><input type="text" name="boardWriter" id="boardWriter" style="width:100%"/></td>
			   			     </tr>
			   			     <tr>
			        			<th scope="row"><label for="boardRegdate"> 날짜 </label></th>
			       				 <td><input type="date" name="boardRegdate" id="boardRegdate" style="width:100%"/></td>
			   			     </tr>
			   			  </tbody>
			   		 </table>
			   		 
			   		 <input class="btn btn-primary" type="submit" role="button" value="저장">	  
				
				</form>
		</div>
</body>
</html>