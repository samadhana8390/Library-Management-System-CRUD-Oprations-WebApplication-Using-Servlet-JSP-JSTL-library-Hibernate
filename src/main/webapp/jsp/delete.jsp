<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/style5.css">
</head>
<body>
	<form>
		<nav>
			<li><a href="addLibrarian.jsp">Add Info</a></li>
			<li><a href="readdata.jsp">View Info</a></li>
			<li><a href="">Delete Info</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form><br><br><br><br><br>
<center><form action="../deleteLibrerian" method="get">
<table class="styled-table">
		<thead>
				<tr>
			<th></th><th>Delete Librarian</th>
		</tr>
		</thead>
		<tbody>
			<tr>
				<td>Id :</td>
				<td><input type="text" name="id"></td>
			</tr>
		</tbody>
			<tr>
				<td><input class="btn btn-info" type="submit" value="submit"></td>
				<td><input class="btn btn-danger" type="reset" value="reset"></td>
			</tr>
		</table>
	</form>
	</center>	
</body>
</html>