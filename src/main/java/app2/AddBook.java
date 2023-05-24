package app2;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao2.Book_dao;
import dao2.Book_imp;
import model.Book;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Book_dao dao;
	
	@Override
	public void init() throws ServletException {

		 dao=new Book_imp();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		int bookno=Integer.parseInt(request.getParameter("bookno"));
		String bookname=request.getParameter("bookname");
		String author=request.getParameter("author");
		String publisher=request.getParameter("publisher");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int issueid=Integer.parseInt(request.getParameter("issueid"));
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				
		Book book=new Book();
		book.setBook_no(bookno);
		book.setBook_name(bookname);
		book.setBook_author(author);
		book.setBook_publisher(publisher);
		book.setBook_quantity(quantity);
		book.setIssueid(issueid);
		book.setDate(date);
		
		
		
		 dao.savedata(book);
		
		 response.sendRedirect("jsp2/Librarian.jsp");
		
		
		
	}

}
