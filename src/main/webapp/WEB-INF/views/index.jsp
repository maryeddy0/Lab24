<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/flatly/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T5jhQKMh96HMkXwqVMSjF3CmLcL1nT9//tCqu9By5XSdj7CwR0r+F3LTzUdfkkQf"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Welcome to Java Bean</title>
</head>
<body>

	<h1>Welcome to Java Bean</h1>

	<a href="reg?register=newUser">Register Here</a>

	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Desription</td>
				<td>Quantity</td>
				<td>Price</td>
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
					<%-- <td><a href="update-form?id=${item.id}">Update</a></td>
					<td><a href="delete?id=${item.id}">Delete</a></td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<a href="add"></a>

</body>
</html>