<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${test}" var="item">
				<tr>
					<td>${item.name }</td>
					<td>${item.email }</td>
					<td>${item.phone }</td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="add"></a>
	
	
</body>
</html>