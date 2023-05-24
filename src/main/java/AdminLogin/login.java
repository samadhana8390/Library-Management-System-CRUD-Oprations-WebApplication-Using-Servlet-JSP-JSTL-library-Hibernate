package AdminLogin;
import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DButil;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DButil util;
	@Override
	public void init() throws ServletException {
		
		util=new DButil();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String login=request.getParameter("Loginname");
		String password=request.getParameter("password");
		
		int r=0;
		try
		{
			Connection con=DButil.getDBConnection();	
			
			String s="select * from login where username= ? and password= ?";
			PreparedStatement sq=con.prepareStatement(s);
			sq.setString(2,password);
			sq.setString(1,login);
 
			ResultSet rs=sq.executeQuery();

			
				while(rs.next())
				{
					r=1;	
				}
				
		} 
		catch (SQLException e1)
		{
			e1.printStackTrace();
		}
		if (r > 0)
		{
			
			response.sendRedirect("jsp/Admin.jsp");
		} 
		else
		{
			out.print("<h1> Increate id password..!!</h1>");
		}
			 
			  

		
	}
}
