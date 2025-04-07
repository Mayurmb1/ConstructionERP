package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteProjectData
 */
public class deleteProjectData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteProjectData() {
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
		try
		{

			Connection con = ConnectsDB.getConnect();
			//int pid = Integer.parseInt(request.getParameter("pid"));
			int pid=1;
			PreparedStatement ps3 = con.prepareStatement("delete * from projectdata where pid =?");                  
			ps3.setInt(1, pid);
			

			int i = ps3.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("Welcome.html");

			}
			else
			{
				System.out.println("Failed to Delete..!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
