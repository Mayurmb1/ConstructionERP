<%@ page import ="com.mayur.construction.*"%>
<%@ page import ="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Construction</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />

<!-- font-awesome icons CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons CSS -->

 <!-- side nav css file -->
 <link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>
 <!-- side nav css file -->
 
 <!-- js-->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>

<!--webfonts-->
<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext" rel="stylesheet">
<!--//webfonts--> 

<!-- Metis Menu -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<link href="css/custom.css" rel="stylesheet">
<!--//Metis Menu -->

</head> 
<body class="cbp-spmenu-push">
	<div class="main-content">
	<div class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
		<!--left-fixed -navigation-->
		<aside class="sidebar-left">
      <nav class="navbar navbar-inverse">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".collapse" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><span class="fa fa-area-chart"></span> Construction</a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="sidebar-menu">
              <li class="header">MAIN NAVIGATION</li>
              
                            
                <li class="treeview">
                <a href="#">
                <i class="fa fa-laptop"></i>
                <span>Employee</span>
                <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                  <li><a href="AddEmployee.html"><i class="fa fa-angle-right"></i> Add Employee</a></li>
                    <li><a href="ViewEmployee.jsp"><i class="fa fa-angle-right"></i> View Employee</a></li>
                </ul>
              </li>
              
                 <li class="treeview">
                <a href="#">
                <i class="fa fa-laptop"></i>
                <span>Department</span>
                <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                  <li><a href="AddDepartment.html"><i class="fa fa-angle-right"></i> Add Department</a></li>
                    <li><a href="ViewDepartment.html"><i class="fa fa-angle-right"></i> View Department</a></li>
                </ul>
              </li>
              
              
              
              <li class="treeview">
                <a href="#">
                <i class="fa fa-laptop"></i>
                <span>Projects</span>
                <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                
 				 <li><a href="CreateProject.html"><i class="fa fa-angle-right"></i> Create New Projects</a></li>
                 <li><a href="ViewProjectsToAdmin.jsp"><i class="fa fa-angle-right"></i> View Projects</a></li>
                    
                </ul>
              </li>
              
               <li class="treeview">
                <a href="#">
                <i class="fa fa-laptop"></i>
                <span>Task</span>
                <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                
 				 <li><a href="Task.jsp"><i class="fa fa-angle-right"></i> Add Task</a></li>
                 <li><a href="viewTask.jsp"><i class="fa fa-angle-right"></i> View Task</a></li>
                    
                </ul>
              </li>
            
              
              
                
            </ul>
          </div>
          <!-- /.navbar-collapse -->
      </nav>
    </aside>
	</div>
		<!--left-fixed -navigation-->
		
		<!-- header-starts -->
		<div class="sticky-header header-section ">
			<div class="header-left">
				
				<!--toggle button start-->
				<button id="showLeftPush"><i class="fa fa-bars"></i></button>
				<!--toggle button end-->
				
				<div class="clearfix"> </div>
			</div>
			<div class="header-right">

				
				<div class="profile_details">		
					<ul>
						<li class="dropdown profile_details_drop">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
								<div class="profile_img">	
									<span class="prfil-img"><img src="images/2.jpg" alt=""> </span> 
									<div class="user-name">
										<p>Mayur Borse</p>
										<span>Administrator</span>
									</div>
									<i class="fa fa-angle-down lnr"></i>
									<i class="fa fa-angle-up lnr"></i>
									<div class="clearfix"></div>	
								</div>	
							</a>
							<ul class="dropdown-menu drp-mnu">
							<li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
							</ul>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>				
			</div>
			<div class="clearfix"> </div>	
		</div>
		<!-- //header-ends -->
	<!-- main content start-->
		<div id="page-wrapper">
			<div class="main-page">
				
				<div>
					<h2 class="title1">Projects :- </h2>
				</div>
						
			
			<div>
				<table class="table">
					<tr>
						<th>PID</th>
						<th>Project Name</th>
						<th>Project Email</th>
						<th>Action 1</th>
						<th>Action 2</th>
						<th>Action 3</th>			
					</tr>
				
			<%try{
				Connection con = ConnectsDB.getConnect();
				PreparedStatement ps1 = con.prepareStatement("select * from projectdetails");
				ResultSet rs = ps1.executeQuery();
				while(rs.next()){
				%>
				<tr>
					<td><%=rs.getInt("pid") %></td>
					<td><%=rs.getString("pname") %></td>
					<td><%=rs.getString("paddress") %></td>
					<td><a href="openProject.jsp?id=<%=rs.getInt("pid")%>">Open</a></td>
					<td><a href="viewReport.jsp?id=<%=rs.getInt("pid")%>">View Reports</a></td>	
					<td><a href="deleteProject.jsp?id=<%=rs.getInt("pid")%>">Delete</a></td>	
				</tr>
					<%
					}
					}catch(Exception e)
			{
						
					e.printStackTrace()	;
					
			}
				%>
				</table>
			</div>
				
										
		<!--footer-->
		<div class="footer">
		   <p>&copy; 2022 Construction Design Dashboard. All Rights Reserved | Design by MayurMB </p>		</div>
	   </div>
        <!--//footer-->
	</div>
	
	<!-- side nav js -->
	<script src='js/SidebarNav.min.js' type='text/javascript'></script>
	<script>
      $('.sidebar-menu').SidebarNav()
    </script>
	<!-- //side nav js -->
	
	<!-- Classie --><!-- for toggle left push menu script -->
		<script src="js/classie.js"></script>
		<script>
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' ),
				showLeftPush = document.getElementById( 'showLeftPush' ),
				body = document.body;
				
			showLeftPush.onclick = function() {
				classie.toggle( this, 'active' );
				classie.toggle( body, 'cbp-spmenu-push-toright' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeftPush' );
			};
			
			function disableOther( button ) {
				if( button !== 'showLeftPush' ) {
					classie.toggle( showLeftPush, 'disabled' );
				}
			}
		</script>
	<!-- //Classie --><!-- //for toggle left push menu script -->
	
	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	
	<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.js"> </script>
   
</body>
</html>