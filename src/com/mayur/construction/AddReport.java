
package com.mayur.construction;

import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddReport
 */
public class AddReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReport() {
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
		int pid   = Integer.parseInt(request.getParameter("pid"));

		PreparedStatement ps1 = con.prepareStatement("select asigner from projectdetails where pid =? ");
		ps1.setInt(1, pid);
		ResultSet rs1 = ps1.executeQuery();
		while(rs1.next()){
		String asigner = rs1.getString("asigner");
		
		int date = Integer.parseInt(request.getParameter("date"));
		
		//String asigner = request.getParameter("pname");
		String weather = request.getParameter("weather");
		String weatherimpact = request.getParameter("weatherimpact");
		String accident = request.getParameter("accident");
		String injuries = request.getParameter("injuries");
		String wrkdone = request.getParameter("wrknderscr");
		String equipmentused = request.getParameter("equipment");
		String materialdelivery = request.getParameter("mtrldelvry");
		String materialquantity = request.getParameter("mtrlquantity");



			PreparedStatement ps3 = con.prepareStatement("insert into report values(?,?,?,?,?,?,?,?,?,?,?,?)");                  
			ps3.setInt(1, 0);
			ps3.setInt(2, date);
			ps3.setString(3, asigner);
			ps3.setString(4, weather);
			ps3.setString(5, weatherimpact);
			ps3.setString(6, accident);
			ps3.setString(7, injuries);
			ps3.setString(8, wrkdone);
			ps3.setString(9, equipmentused);
			ps3.setString(10, materialdelivery);
			ps3.setString(11, materialquantity);
			ps3.setInt(12, pid);

                                   
		

			int i = ps3.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("ViewProjectstoEmp.jsp");

			}
			else
			{
				response.sendRedirect("AddReport.html");			}
		}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
