<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
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
.styled-table th,
.styled-table td {
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
body {
	background-image: url("../img/b1.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

nav li {
	list-style-type: none;
	display: inline-block;
	padding: 27px 43px;
}

nav li a {
	color: black;
	text-decoration: none;
	font-weight: bold;
	text-transform: capitalize;
}

nav li a:hover {
	color: #f9004d;
	transition: .4s;
}
td
{
	
	color: black;
}
</style>

</head>
<body>
	<form>
		<nav>
			<li><a href="jsp2/AddBook.jsp">Add Info</a></li>
			<li><a href="jsp2/opstion_view.jsp">view info</a></li>
			<li><a href="">Issue Add</a></li>
			<li><a href="jsp2/ReturnIssue.jsp">Return</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>
	<form action="http://localhost:8081/Library/add_issue2" method="get">
		<center>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<table class="styled-table">
				<thead>
					<tr>
						<th></th><th>Add Issue</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					<td>Book Id :</td>
					<td><input type="text" name="bookid"
						value="${requestScope.book.book_id}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Book No :</td>
					<td><input type="text" name="bookno"
						value="${requestScope.book.book_no}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Book Name :</td>
					<td><input type="text" name="bookname"
						value="${requestScope.book.book_name}"></td>
				</tr>
				<td>Student Name :</td>
				<td><input type="text" name="sname"></td>
				</tr>
				<tr>
					<td>Student contact :</td>
					<td><input type="text" name="scontact"></td>
				</tr>
				<tr>
					<td>Book Quantity :</td>
					<td><input type="text" name="quantity"
						value="${requestScope.book.book_quantity}" readonly="readonly"></td>
				</tr>
				<tbody>
				<tr>
					<td><input class="btn btn-info" type="submit" value="Issue Book"></td>
					<td><input class="btn btn-danger" type="reset" value="reset"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>