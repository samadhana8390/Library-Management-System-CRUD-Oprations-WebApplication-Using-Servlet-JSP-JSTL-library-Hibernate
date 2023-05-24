<%@page import="java.util.List"%>
<%@page import="dao.LibrariandaoFactory"%>
<%@page import="dao.Librariandao"%>
<%@page import="util.AdminSesstion"%>
<%@page import="model.Librarian"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/style4.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>

	<form>
		<nav>
			<li><a href="addLibrarian.jsp">Add Info</a></li>
			<li><a href="">View Info</a></li>
			<li><a href="delete.jsp">Delete Info</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>
	<br>
	<br>
	<br>
	<br>
	<%Librariandao dao; %>
	<%
		dao=LibrariandaoFactory.getInstance();
		List list=dao.readdata();
		
	%>
	<%
	application.setAttribute("list", list);
	%>
	<div class="container">
		<table class="styled-table">
		<thead>
			<tr>
				<th>Sr</th>
				<th>Name</th>
				<th>Email</th>
				<th>contact</th>
				<th>Address</th>
				<th>City</th>
				<th>User name</th>
				<th>Password</th>
				<th>Update</th>
			</tr>
		</thead>
	<tbody>



			<c:forEach var="st" items="${applicationScope.list}">

				<tr>
					<td><c:out value="${st.sr}"></c:out></td>
					<td><c:out value="${st.name}"></c:out></td>
					<td><c:out value="${st.email}"></c:out></td>
					<td><c:out value="${st.contact}"></c:out></td>
					<td><c:out value="${st.address}"></c:out></td>
					<td><c:out value="${st.city}"></c:out></td>
					<td><c:out value="${st.uname}"></c:out></td>
					<td><c:out value="${st.password}"></c:out></td>
					
					
					<td><a
						class="btn btn-info" href="${pageContext.request.contextPath}/UpdataLibrerian?sr=${st.sr}">UPDATE</a></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
</body>
</html>