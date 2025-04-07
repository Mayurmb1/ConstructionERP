<%@ page import ="com.mayur.construction.*"%>
<%@ page import ="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	

	Connection con = ConnectsDB.getConnect();
  	int id   = Integer.parseInt(request.getParameter("id"));

	PreparedStatement ps1 = con.prepareStatement("delete  from deptdetails where vid = ?");
	ps1.setInt(1,id);
	int i = ps1.executeUpdate();
	if(i>0){
		response.sendRedirect("ViewDepartment.jsp");
		
	}else{
		response.sendRedirect("ViewDepartment.jsp"); 

	}
	%>
	
</body>
</html>