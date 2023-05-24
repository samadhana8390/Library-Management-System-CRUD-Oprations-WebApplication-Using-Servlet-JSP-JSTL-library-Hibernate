<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="http://localhost:8081/Library/UpdateBook2" method="get">
		<center>
		<br><br><br><br><br><br>
			<table>
			<tr>
				<td>Book Id :</td>
				<td><input type="text" name="bookid"value="${requestScope.book.book_id}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Book No :</td>
				<td><input type="text" name="bookno"value="${requestScope.book.book_no}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Book Name :</td>
				<td><input type="text" name="bookname"value="${requestScope.book.book_name}"></td>
			</tr>
			<tr>
				<td>Author :</td>
				<td><input type="text" name="author" value="${requestScope.book.book_author}"></td>
			</tr>
			<tr>
				<td>Publisher :</td>
				<td><input type="text" name="publisher" value="${requestScope.book.book_publisher}"></td>
			</tr>
			<tr>
				<td>Quantity :</td>
				<td><input type="text" name="quantity" value="${requestScope.book.book_quantity}"></td>
			</tr>
			<tr>
				<td>Date :</td>
				<td><input type="text" name="date" value="${requestScope.book.date}"readonly="readonly"></td>
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