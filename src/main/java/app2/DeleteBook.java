package app2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao2.Book_dao;
import dao2.Book_daoFactory;
import dao2.Book_imp;
import model.Book;

@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
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
		
		int book_id=Integer.parseInt(request.getParameter("book_id"));
		
		dao.deletedata(book_id);

		response.sendRedirect("jsp2/Book_view.jsp");

		
		
	}

}
