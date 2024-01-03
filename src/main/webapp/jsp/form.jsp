<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="/jsp/save.jsp" method="post">  <!-- action은 주소 url , method는 방식 -> 목적 crud -->
		
		
		이름: <input type="text" name="username" />
		암호: <input type="text" name="password" />
		
		<button type="submit">전송</button>
	</form>
	
</body>
</html>