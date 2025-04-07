package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaskServlet
 */
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
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
		
			
			String title = request.getParameter("title");
			String priority = request.getParameter("priority");
			String location = request.getParameter("location");
			String sdate = request.getParameter("sdate");
			String edate = request.getParameter("edate");
			int mnreqrd = Integer.parseInt(request.getParameter("mnreqrd"));

			try
			{

				Connection con = ConnectsDB.getConnect();
				PreparedStatement ps3 = con.prepareStatement("insert into task values(?,?,?,?,?,?,?,?)");                  
				ps3.setInt(1, 0);
				ps3.setString(2, title);
				//ps3.setString(3, UserData.getAsigner());
				ps3.setString(3, "Admin");

				ps3.setString(4, priority);
				ps3.setString(5, location);
				ps3.setString(6, sdate);
				ps3.setString(7, edate);
				ps3.setInt(8, mnreqrd);


			

				int i = ps3.executeUpdate();
				if(i>0)
				{
					response.sendRedirect("AdminTask.html");

				}
				else
				{
					response.sendRedirect("CreateProject.html");			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		
	}

}
