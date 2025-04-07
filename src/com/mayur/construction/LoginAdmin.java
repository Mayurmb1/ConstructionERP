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
 * Servlet implementation class LoginAdmin
 */
public class LoginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdmin() {
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
			 	UserData.setAsigner("admin");
				Connection con = ConnectsDB.getConnect();
				/*String em = "mayurmb1633@gmail.com";
				String pass = "1234";
				PreparedStatement ps2 = con.prepareStatement("insert into admin values(?,?)");                  
				ps2.setString(1, em);
				ps2.setString(2, pass);
				
				ps2.executeUpdate();*/
				
				String email = request.getParameter("email");
				String pwd = request.getParameter("password");
				PreparedStatement ps8 = con.prepareStatement("select * from admin where memail = ? and mpass = ?");
				ps8.setString(1, email);
				ps8.setString(2, pwd);
			
				ResultSet rs8 = ps8.executeQuery();

				while(rs8.next())
				{
					response.sendRedirect("AdminTask.html");
				}
				response.sendRedirect("AdminLogin.html");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

}
