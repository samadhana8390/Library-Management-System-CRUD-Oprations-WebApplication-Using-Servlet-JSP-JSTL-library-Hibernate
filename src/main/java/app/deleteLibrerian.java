package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Librariandao;
import dao.LibrariandaoFactory;

@WebServlet("/deleteLibrerian")
public class deleteLibrerian extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Librariandao dao;

	@Override
	public void init() throws ServletException {

		dao = LibrariandaoFactory.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sr = Integer.parseInt(request.getParameter("id"));

		dao.deletedata(sr);

		response.sendRedirect("jsp/readdata.jsp");

	}

}
