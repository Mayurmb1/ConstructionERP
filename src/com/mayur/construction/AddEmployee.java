package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddEmployee
 */
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
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
		
		   int eid   = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		String email = request.getParameter("email");
		String pass  = request.getParameter("password");
		String cont  = request.getParameter("mob");
		String emgcont  = request.getParameter("emob");
		String dept  = request.getParameter("department");
		
		
		try
		{

			Connection con = ConnectsDB.getConnect();
			PreparedStatement ps3 = con.prepareStatement("insert into empdetails values(?,?,?,?,?,?,?)");                  
			ps3.setInt(1, eid);
			ps3.setString(2, ename);
			ps3.setString(3, email);
			ps3.setString(4, pass);
			ps3.setString(5, cont);
			ps3.setString(6, emgcont);
			ps3.setString(7, dept);

			int i = ps3.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("AdminTask.html");
			}
			else
			{
				response.sendRedirect("AddEmployee.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
