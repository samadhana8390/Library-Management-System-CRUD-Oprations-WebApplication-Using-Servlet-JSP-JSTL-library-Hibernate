<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.styled-table {
	border-collapse: collapse;
	margin: 25px 0;
	font-size: 0.9em;
	font-family: sans-serif;
	min-width: 400px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.styled-table thead tr {
	background-color: #009879;
	color: #ffffff;
	text-align: left;
}

.styled-table tbody tr.active-row {
	font-weight: bold;
	color: #009879;
}

.styled-table th, .styled-table td {
	padding: 12px 15px;
}

.styled-table tbody tr {
	border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
	background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
	border-bottom: 2px solid #009879;
}


nav li {
	list-style-type: none;
	display: inline-block;
	padding: 27px 43px;
}

nav li a {
	color: white;
	text-decoration: none;
	font-weight: bold;
	text-transform: capitalize;
}

nav li a:hover {
	color: #f9004d;
	transition: .4s;
}

td {
	color: black;
}
</style>
</head>
<body background="../img/b1.jpg">
	<nav>
		<li><a href="AddBook.jsp">Add Info</a></li>
		<li><a href="opstion_view.jsp">view info</a></li>
		<li><a href="Add_Issue.jsp">Issue Add</a></li>
		<li><a href="ReturnIssue.jsp">Return</a></li>
		<li><a href="../index.html">Exit</a></li>
	</nav>
	</form>
	<form action="http://localhost:8081/Library/updateIssue2" method="get">
		<center>
			<br> <br> <br> <br> <br> <br>
			<table class="styled-table">
				<thead>
					<tr>
						<th></th>
						<th>Issue</th>
					</tr>
				</thead>

				<tr>
					<td>Book Id :</td>
					<td><input type="text" name="bookid"
						value="${requestScope.issue.book_id}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Book No :</td>
					<td><input type="text" name="bookno"
						value="${requestScope.issue.book_no}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Book Name :</td>
					<td><input type="text" name="bookname"
						value="${requestScope.issue.book_name}"></td>
				</tr>
				<td>Student Id :</td>
				<td><input type="text" name="sid"
					value="${requestScope.issue.student_id}" readonly="readonly"></td>
				</tr>
				</tr>
				<td>Student Name :</td>
				<td><input type="text" name="sname"
					value="${requestScope.issue.student_name}"></td>
				</tr>
				<tr>
					<td>Student contact :</td>
					<td><input type="text" name="scontact"
						value="${requestScope.issue.student_contact}"'></td>
				</tr>
				<tr>
					<td>Book Quantity :</td>
					<td><input type="text" name="quantity"
						value="${requestScope.issue.book_quantity}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Date :</td>
					<td><input type="text" name="date"
						value="${requestScope.issue.date}" readonly="readonly"></td>
				</tr>

				<tr>
				<thead>
					<td><th><input type="submit" value="UPDATE"></th></td>
					
				</thead>
				</tr>
			</table>
		</center>
	</form>



</body>
</html>