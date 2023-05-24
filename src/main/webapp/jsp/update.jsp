<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<body>
<br><br><br><br>
	<center>
		<h1>------------- Update data -------------</h1>
	</center>

	<form action="http://localhost:8081/Library/UpdateLibrerian2"
		method="get">
		<center>
			<table>
			<br><br><br>
			
				<tr>
					<td>Sr :</td>
					<td><input type="text" name="sr"
						value="${requestScope.librarian.sr}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"
						value="${requestScope.librarian.name}"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="text" name="email"
						value="${requestScope.librarian.email}" ></td>
				</tr>
				<tr>
					<td>Contact :</td>
					<td><input type="text" name="contact"
						value="${requestScope.librarian.contact}"></td>
				</tr>
				<tr>
					<td>Address :</td>
					<td><input type="text" name="address"
						value="${requestScope.librarian.address}"></td>
				</tr>
				<tr>
					<td>City :</td>
					<td><input type="text" name="city"
						value="${requestScope.librarian.city}" ></td>
				</tr>
				<tr>
					<td>UserName :</td>
					<td><input type="text" name="uname"
						value="${requestScope.librarian.uname}"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="text" name="pass"
						value="${requestScope.librarian.password}"></td>
				</tr>
				
				<tr>
					<td><input class="btn btn-info" type="submit" value="submit"></td>
				<td><input class="btn btn-danger" type="reset" value="reset"></td>
				</tr>
			</table>
		</center>
	</form>

</body>
</html>