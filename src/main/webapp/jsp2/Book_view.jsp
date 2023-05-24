<%@page import="java.util.List"%>
<%@page import="dao2.Book_daoFactory"%>
<%@page import="dao2.Book_imp"%>
<%@page import="dao2.Book_dao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/style3.css">
</head>
<body>
	<form>
		<nav>
			<li><a href="">Book view</a></li>
			<li><a href="Issue_view.jsp">Issue view</a></li>
			<li><a href="Librarian.jsp">Exit</a></li>
		</nav>
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%
	Book_dao dao;
	%>
	<%
	dao = Book_daoFactory.getinstance();
	List list = dao.readdata();
	%>
	<%
	application.setAttribute("list", list);
	%>
	<center>	<table class="styled-table">
		 <thead>
			<tr>
				<th>Book id</th>
				<th>Book no</th>
				<th>Book name</th>
				<th>Author</th>
				<th>Publisher</th>
				<th>Quantity</th>
				<th>Issue Book</th>
				<th>Date</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="st" items="${applicationScope.list}">

				<tr class="active-row">
					<td><c:out value="${st.book_id}"></c:out></td>
					<td><c:out value="${st.book_no}"></c:out></td>
					<td><c:out value="${st.book_name}"></c:out></td>
					<td><c:out value="${st.book_author}"></c:out></td>
					<td><c:out value="${st.book_publisher}"></c:out></td>
					<td><c:out value="${st.book_quantity}"></c:out></td>
					<td><c:out value="${st.issueid}"></c:out></td>
					<td><c:out value="${st.date}"></c:out></td>
					<td><a class="btn btn-info" href="${pageContext.request.contextPath}/UpdateBook?book_id=${st.book_id}">UPDATE</a></td>
					<td><a
						class="btn btn-danger" href="${pageContext.request.contextPath}/DeleteBook?book_id=${st.book_id}">DELETE</a></td>
				</tr>
			<tbody>
			</c:forEach>
		</table>
		</center>
</body>
</html>