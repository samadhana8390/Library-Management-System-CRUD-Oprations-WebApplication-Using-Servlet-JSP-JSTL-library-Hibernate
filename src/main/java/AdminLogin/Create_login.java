package AdminLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DButil;

@WebServlet("/Create_login")
public class Create_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DButil util;
	@Override
	public void init() throws ServletException {
		
		util=new DButil();
	}

	protected void doGet(HttpServletRequest 
			request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String loginname = request.getParameter("loginname");
		String password = request.getParameter("password");

		out.print("<center>");
		out.print("<h1>-- login Form --</h1>");
		out.print("</center>");
		out.print("<br>");
		out.print("DATA SAVED..!!");

		int r = 0;
		try {

			Connection con=DButil.getDBConnection();
			
			String s = "insert into login values(?,?)";
			PreparedStatement sq = con.prepareStatement(s);

			sq.setString(1, loginname);
			sq.setString(2, password);
			r = sq.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
			out.print(e1);
		}

		if (r > 0) {
			
			response.sendRedirect("html/ALogin.html");

			
		} else {
			out.print("error..!!");
		}

		
	}
	
	
		
}
