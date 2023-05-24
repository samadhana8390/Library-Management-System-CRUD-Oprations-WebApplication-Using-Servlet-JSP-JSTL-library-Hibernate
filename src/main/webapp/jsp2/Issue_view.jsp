<%@page import="java.util.List"%>
<%@page import="dao2.Book_daoFactory"%>
<%@page import="dao2.Book_dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<li><a href="Book_view.jsp">Book view</a></li>
			<li><a href="">Issue view</a></li>
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
	List list = dao.issuereaddata();
	%>
	<%
	application.setAttribute("list", list);
	%>
	<center>
		<table class="styled-table">
		    <thead>
			<tr>
				<th>book id</th>
				<th>book no</th>
				<th>book name</th>
				<th>Student id</th>
				<th>Student Name</th>
				<th>Contact</th>
				<th>Quantity</th>
				<th>date</th>
				<th>Update</th>
			</tr>
			    </thead>
			        <tbody>
			<c:forEach var="st" items="${applicationScope.list}">

				<tr class="active-row">
					<td><c:out value="${st.book_id}"></c:out></td>
					<td><c:out value="${st.book_no}"></c:out></td>
					<td><c:out value="${st.book_name}"></c:out></td>
					<td><c:out value="${st.student_id}"></c:out></td>
					<td><c:out value="${st.student_name}"></c:out></td>
					<td><c:out value="${st.student_contact}"></c:out></td>
					<td><c:out value="${st.book_quantity}"></c:out></td>
					<td><c:out value="${st.date}"></c:out></td>
					<td><a class="btn btn-info" href="${pageContext.request.contextPath}/UpdateIssue?student_id=${st.student_id}">UPDATE</a></td>
				</tr>
				    </tbody>
			</c:forEach>
		</table>
</center>
</body>
</html>