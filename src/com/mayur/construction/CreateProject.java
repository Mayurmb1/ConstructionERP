package com.mayur.construction;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateProject
 */
public class CreateProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateProject() {
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
		
		   int pid   = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String paddress = request.getParameter("paddress");

		try
		{

			Connection con = ConnectsDB.getConnect();
			PreparedStatement ps3 = con.prepareStatement("insert into projectdetails values(?,?,?,?)");                  
			ps3.setInt(1, pid);
			ps3.setString(2, pname);
			ps3.setString(3, paddress);
			ps3.setString(4, "admin");
		

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
