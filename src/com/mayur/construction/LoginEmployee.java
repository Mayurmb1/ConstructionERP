package com.mayur.construction;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginEmployee
 */
public class LoginEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginEmployee() {
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
		
			
			String email = request.getParameter("email");
			//UserData.setEmpmail(email);
			String pwd = request.getParameter("password");
			PreparedStatement ps8 = con.prepareStatement("select * from empdetails where empemail = ? and password = ?");
			ps8.setString(1, email);
			ps8.setString(2, pwd);
		
			ResultSet rs8 = ps8.executeQuery();

			while(rs8.next())
			{
				UserData.setEmpmail(email);
				response.sendRedirect("EmpPanel.html");
				
			}
			response.sendRedirect("Employeelogin.html");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		
		
		
	}

}
