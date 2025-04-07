package com.mayur.construction;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectData
 */
public class ProjectData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectData() {
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
		try{
		Connection con = ConnectsDB.getConnect();
		String rsdept   = request.getParameter("rsdpt");
		String rsemp   = request.getParameter("rsemp");
		String tskdept   = request.getParameter("tsdpt");
		String tskemp   = request.getParameter("tsemp");


		PreparedStatement ps9 = con.prepareStatement("insert into projectdata values(?,?,?,?,?)");
			ps9.setInt(1, UserData.getPid());  
			ps9.setString(2, rsdept);
			ps9.setString(3, rsemp);
			ps9.setString(4, tskdept);
			ps9.setString(5, tskemp);
			

			int i = ps9.executeUpdate();
			response.sendRedirect("AdminTask.html");
			if(i>0){
				
				response.sendRedirect("AdminTask.html");
			}
			else{
				response.sendRedirect("CreateProject.html");			}
		
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
