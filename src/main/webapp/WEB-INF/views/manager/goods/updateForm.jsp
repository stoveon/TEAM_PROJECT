<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<c: url value="/manager/goods/updateGoods" />" method="post" enctype="multipart/form-data">
	<table>
		<tr><td>상품 수정</td>
			<td><input type="submit" value="상품수정"/>
			<input type="button" onClick="location.href='<c:url value="" />'" value="수정취소"/></td>
		</tr>
		<tr>
			<td>상품명</td><td><input type="text" name="goodsName" value="${goodsName}" /></td>
			<td>가격</td><td><input type="number" name="price" value="${price}" /></td>
			<td><input type="radio" name="stock" value="0" /> +0
			<input type="radio" name="stock" value="10" /> +10
			<input type="radio" name="stock" value="20" /> +20
			</td>
		</tr>
		<tr>
			<td><textarea rows="10" cols="100" name="content">${content}</textarea></td>
		</tr>
		<tr><td>파일 추가</td>
		<c:forEach items="goodsImage" var="fileName">
		<td><input type="checkbox" name="deleteFile"/>${fileName}</td>
		</c:forEach>
		</tr>
	</table>
</form>
</body>
</html>