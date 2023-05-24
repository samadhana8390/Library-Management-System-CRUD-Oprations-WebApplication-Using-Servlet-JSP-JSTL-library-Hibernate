package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Librariandao;
import dao.LibrariandaoFactory;
import model.Librarian;

@WebServlet("/UpdateLibrerian2")
public class UpdateLibrerian2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
Librariandao dao;
	
	@Override
	public void init() throws ServletException {
		
		 dao= LibrariandaoFactory.getInstance();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int sr=Integer.parseInt(request.getParameter("sr"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int contact=Integer.parseInt(request.getParameter("contact"));
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		Librarian lib=new Librarian();
		lib.setSr(sr);
		lib.setName(name);
		lib.setEmail(email);
		lib.setContact(contact);
		lib.setAddress(address);
		lib.setCity(city);
		lib.setUname(uname);
		lib.setPassword(pass);
		
		Librarian librarian=dao.update(lib);
		response.sendRedirect("jsp/readdata.jsp");
	}

}
