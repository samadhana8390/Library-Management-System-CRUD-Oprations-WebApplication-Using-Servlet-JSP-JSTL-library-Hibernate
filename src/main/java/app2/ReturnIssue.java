package app2;

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

@WebServlet("/ReturnIssue")
public class ReturnIssue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DButil util;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = DButil.getDBConnection();

		int bid = Integer.parseInt(request.getParameter("bookid"));
		int sid = Integer.parseInt(request.getParameter("studentid"));
		
		out.print(bid);
		out.print(sid);
		
		
		
		int r = 0;
		
		try {
			
			
			String qur = "select * from issue where book_id=? and student_id=?";
			PreparedStatement p = con.prepareStatement(qur);
			p.setInt(1, bid);
			p.setInt(2, sid);
			ResultSet rs=p.executeQuery();

			
			while(rs.next())
			{
				r=1;	
			}

			
			if (r > 0) {

				try {
					
					String q = "delete from issue where book_id=? and student_id=?";
					PreparedStatement ps = con.prepareStatement(q);
					ps.setInt(1, bid);
					ps.setInt(2, sid);
					ps.executeUpdate();



					String q1 = "update Book set issueid = issueid-1 where book_id=?";
					PreparedStatement ps1 = con.prepareStatement(q1);
					ps1.setInt(1, bid);
					ps1.executeUpdate();



					String q2 = "update Book set book_quantity=book_quantity+1 where book_id=?";
					PreparedStatement ps2 = con.prepareStatement(q2);
					ps2.setInt(1, bid);
					ps2.executeUpdate();
					
					
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
				response.sendRedirect("jsp2/Issue_view.jsp");
				
			} else
			{
				out.print("<h1> Data not found....!! </h1>");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
