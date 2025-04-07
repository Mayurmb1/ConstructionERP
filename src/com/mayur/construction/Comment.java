package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Comment
 */
public class Comment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
			String cmnt = request.getParameter("cmnt");

			try
			{

				Connection con = ConnectsDB.getConnect();
				PreparedStatement ps3 = con.prepareStatement("insert into Comment values(?,?,?)");                  
				ps3.setInt(1, 0);
				ps3.setString(2, cmnt);
				ps3.setString(3, UserData.getEmpmail());
			

				int i = ps3.executeUpdate();
				if(i>0)
				{
					response.sendRedirect("ViewTaskoEmp");

				}
				else
				{
					response.sendRedirect("Comment.html");			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}

}
