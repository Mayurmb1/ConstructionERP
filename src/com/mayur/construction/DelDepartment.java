package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelDepartment
 */
public class DelDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelDepartment() {
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
		
		int eid = Integer.parseInt(request.getParameter("did"));
		try
		{

			Connection con = ConnectsDB.getConnect();
			PreparedStatement ps3 = con.prepareStatement("delete * from empdetails where eid = ?");                  
			ps3.setInt(1, eid);
			

			int i = ps3.executeUpdate();
			if(i>0)
			{
				System.out.println("Department Deleted Successfully");

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
