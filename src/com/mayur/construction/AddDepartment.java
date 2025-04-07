package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddDepartment
 */
public class AddDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDepartment() {
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
		  	int deptid   = Integer.parseInt(request.getParameter("did"));
			String venname = request.getParameter("vname");
			String vemail = request.getParameter("email");
			String vpass  = request.getParameter("password");
			String vcont  = request.getParameter("mob");
			String vaddr  = request.getParameter("address");
			String dept  = request.getParameter("department");
			try
			{
				Connection con = ConnectsDB.getConnect();
				PreparedStatement ps3 = con.prepareStatement("insert into deptdetails values(?,?,?,?,?,?,?)");                  
				ps3.setInt(1, deptid);
				ps3.setString(2, venname);
				ps3.setString(3, vemail);
				ps3.setString(4, vpass);
				ps3.setString(5, vcont);
				ps3.setString(6, vaddr);
				ps3.setString(7, dept);

				int i = ps3.executeUpdate();
				if(i>0)
				{
					response.sendRedirect("AdminTask.html");

				}
				else
				{
					response.sendRedirect("AddDepartment.html");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			

	}

}
