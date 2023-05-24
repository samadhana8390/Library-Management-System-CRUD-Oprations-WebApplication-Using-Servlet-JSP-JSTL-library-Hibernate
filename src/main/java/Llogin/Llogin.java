package Llogin;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Llogin")
public class Llogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String login=request.getParameter("Login");
		String password=request.getParameter("password");
		int r=0;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			
			
			String s="select * from Librarian where password=? and uname=?";
			PreparedStatement sq=con.prepareStatement(s);
			
			sq.setString(1,password);
			sq.setString(2, login);
 
			ResultSet rs=sq.executeQuery();

			
				while(rs.next())
				{
					r=1;	
				}
				
		} 
		catch (ClassNotFoundException | SQLException e1)
		{
			e1.printStackTrace();
		}
		if (r > 0)
		{
			
			response.sendRedirect("jsp2/Librarian.jsp");
		} 
		else
		{
			out.print("<h1> Increate id password..!!</h1>");
		}
			 
	}

}
