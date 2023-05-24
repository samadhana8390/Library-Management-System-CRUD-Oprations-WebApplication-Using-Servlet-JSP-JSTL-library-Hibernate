<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <link rel="stylesheet" href="../css/style5.css">
<body>
<form>
		<nav>
			<li><a href="">Add Info</a></li>
			<li><a href="readdata.jsp">View Info</a></li>
			<li><a href="delete.jsp">Delete Info</a></li>
			<li><a href="../index.html">Exit</a></li>
		</nav>
	</form>
	<br>
	<br>
	<br>
	<br>
	
	<form action="../AddLibrarian" method="get">
	<center>	
	<table class="styled-table">
		<thead>
		<tr>
			<th></th><th>Add Librarian</th>
		</tr>
		</thead>
			<tbody>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name" placeholder="name"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email" placeholder="email"></td>
			</tr>
			<tr>
				<td>contact :</td>
				<td><input type="text" name="contact" placeholder="contact"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><textarea rows="3" cols="20" name="address" placeholder="address"></textarea></td>
			</tr>
			<tr>
				<td>city :</td>
				<td><input type="text" name="city" placeholder="city"></td>
			</tr>
			<tr>
				<td>User name :</td>
				<td><input type="text" name="uname" placeholder="user name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="pass" placeholder="password"></td>
			</tr>
			</tbody>
			<tr>
				<td><input class="btn btn-info" type="submit" value="submit"></td>
				<td><input class="btn btn-danger" type="reset" value="reset"></td>
			</tr>
		</table>
		</center>
	</form>
</body>
</html>