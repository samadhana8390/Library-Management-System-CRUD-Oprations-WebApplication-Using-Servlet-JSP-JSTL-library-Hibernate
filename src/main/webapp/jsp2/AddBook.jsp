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
			<li><a href="">Add Info</a></li>
			<li><a href="opstion_view.jsp">view info</a></li>
			<li><a href="">Issue Info</a></li>
			<li><a href="ReturnIssue.jsp">Return</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>

	<form action="../AddBook" method="get">
		<center>
		<br><br><br><br>
			<table class="styled-table">
			<thead>
		<tr>
			<th></th><th>Add Book</th>
		</tr>
		</thead>
			<tr>
				<td>Book No :</td>
				<td><input type="text" name="bookno"></td>
			</tr>
			<tr>
				<td>Book Name :</td>
				<td><input type="text" name="bookname"></td>
			</tr>
			<tr>
				<td>Author :</td>
				<td><input type="text" name="author"></td>
			</tr>
			<tr>
				<td>Publisher :</td>
				<td><input type="text" name="publisher"></td>
			</tr>
			<tr>
				<td>Quantity :</td>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<td><input class="btn btn-info" type="submit" value="Submit"></td>
				<td><input class="btn btn-danger" type="reset" value="Reset"></td>
			</tr>
			</table>
		</center>
	</form>
</body>
</html>