package app2;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Formatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao2.Book_dao;
import dao2.Book_imp;
import model.Book;

@WebServlet("/UpdateBook2")
public class UpdateBook2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Book_dao dao;
	@Override
	public void init() throws ServletException {

		 dao=new Book_imp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		int bookno=Integer.parseInt(request.getParameter("bookno"));
		String bookname=request.getParameter("bookname");
		String author=request.getParameter("author");
		String publisher=request.getParameter("publisher");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

			Book book=new Book();
			book.setBook_id(bookid);
			book.setBook_no(bookno);
			book.setBook_name(bookname);
			book.setBook_author(author);
			book.setBook_publisher(publisher);
			book.setBook_quantity(quantity);
			book.setDate(date);
			
			dao.updatedata(book);
			 response.sendRedirect("jsp2/Book_view.jsp");

			 
		
		

		

	}

}
