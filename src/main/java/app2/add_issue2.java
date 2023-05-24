package app2;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao2.Book_dao;
import dao2.Book_imp;
import model.Issue;
@WebServlet("/add_issue2")
public class add_issue2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	Book_dao dao;
	
	@Override
	public void init() throws ServletException {

		 dao=new Book_imp();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {
		response.setContentType("text/html");
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		int bookno=Integer.parseInt(request.getParameter("bookno"));
		String bookname=request.getParameter("bookname");
		String sname=request.getParameter("sname");
		int scontact=Integer.parseInt(request.getParameter("scontact"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

		
		Issue issue=new Issue();
		issue.setBook_id(bookid);
		issue.setBook_no(bookno);
		issue.setBook_name(bookname);
		issue.setStudent_name(sname);
		issue.setStudent_contact(scontact);
		issue.setBook_quantity(quantity);
		issue.setDate(date);
		
		dao.addissue(issue,bookid);
		
		response.sendRedirect("jsp2/Issue_view.jsp");

		
		
		
	}

}
