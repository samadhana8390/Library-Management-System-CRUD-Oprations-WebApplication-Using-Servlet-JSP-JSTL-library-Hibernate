package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Librariandao;
import dao.LibrariandaoFactory;
import model.Librarian;
import util.AdminSesstion;

@WebServlet("/UpdataLibrerian")
public class UpdataLibrerian extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Librariandao dao;
	
	@Override
	public void init() throws ServletException {

		dao = LibrariandaoFactory.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		int sr=Integer.parseInt(request.getParameter("sr"));
		
	
		Librarian librarian=dao.update2(sr);
		request.setAttribute("librarian", librarian);
		request.getRequestDispatcher("jsp/update.jsp").forward(request, response);
	   	


	}

}
