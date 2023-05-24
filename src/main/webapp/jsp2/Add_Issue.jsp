<%@page import="java.util.List"%>
<%@page import="dao2.Book_daoFactory"%>
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
			<li><a href="AddBook.jsp">Add Info</a></li>
			<li><a href="opstion_view.jsp">view info</a></li>
			<li><a href="">Issue Add</a></li>
			<li><a href="ReturnIssue.jsp">Return</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>

<br><br><br><br><br>
		<%
	Book_dao dao;
	%>
	<%
	dao = Book_daoFactory.getinstance();
	List list = dao.readBookissue();
	%>
	<%
	application.setAttribute("list", list);
	%>
<center><table class="styled-table">
		<thead>
			<tr>
				<th>book_id</th>
				<th>book_no</th>
				<th>book_name</th>
				<th>book_quantity</th>
				<th>Issue</th>
			</tr>
		</thead>
		    <tbody>
			<c:forEach var="st" items="${applicationScope.list}">

				<tr>
					<td><c:out value="${st.book_id}"></c:out></td>
					<td><c:out value="${st.book_no}"></c:out></td>
					<td><c:out value="${st.book_name}"></c:out></td>
					<td><c:out value="${st.book_quantity}"></c:out></td>
					<td><a
						class="btn btn-info" href="${pageContext.request.contextPath}/Add_issue?book_id=${st.book_id}">Issue</a></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
		</center>
</body>
</html>