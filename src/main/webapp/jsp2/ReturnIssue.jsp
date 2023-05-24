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
<form action="">
<form>
		<nav>
			<li><a href="AddBook.jsp">Add Info</a></li>
			<li><a href="opstion_view.jsp">view info</a></li>
			<li><a href="Add_Issue.jsp">Issue Add</a></li>
			<li><a href="">Return</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>

<br><br><br><br><br>
<center><form action="../ReturnIssue" method="get">
		<table class="styled-table">
		<thead>
		<tr>
			<th></th><th>Ruturn Issue</th>
		</tr>
		</thead>
		<tbody>
			<tr>
				<td>Book Id   :</td>
				<td><input type="text" name="bookid"></td>
			</tr>
			<tr>
				<td>Student Id :</td>
				<td><input type="text" name="studentid"></td>
			</tr>
			<tr>
				<td><input class="btn btn-info" type="submit" value="submit"></td>
				<td><input class="btn btn-danger" type="reset" value="reset"></td>			</tr>
			</tbody>
		</table>
	</form>
	</center>	



</form>
</body>
</html>