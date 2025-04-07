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
				<div class="forms">
					<div class="form-grids row widget-shadow" data-example-id="basic-forms"> 
						<div class="form-title">
							<h4>Create Task :</h4>
						</div>
						<div class="form-body">
							<form action="TaskServlet" method="post"> 
							
								<div class="form-group"> 
									<label for="exampleInputEmail1">Enter Title</label> 
									<input type="text" name="title" class="form-control"  placeholder="Title"> 
								</div> 
								<!-- <div class="form-group"> 
									<label for="exampleInputEmail1">Select Priority</label> 
									<!--<input type="text" name="priority" class="form-control"  placeholder="Priority"> 
								 </div> -->
								<div class="form-group"> 
									<label for="selector1" class="col-sm-2 control-label">Select   Priority</label>
									<div class="col-sm-8"><select name="priority" id="selector1" class="form-control1">
										<option>Select</option>
										<option>Low</option>
										<option>Normal</option>
										<option>High</option>
									</select></div>
								</div>
								<div class="clearfix"> </div>
								
								<div class="form-group"> 
									<label for="exampleInputEmail1">Enter Location</label> 
									<input type="text" name="location" class="form-control"  placeholder="location"> 
								</div> 
								
								<div class="form-group"> 
									<label for="exampleInputEmail1">Start Date</label> 
									<input type="date" name="sdate" class="form-control"  placeholder=""> 
								</div> 
								
								<div class="form-group"> 
									<label for="exampleInputEmail1">End Date</label> 
									<input type="date" name="edate" class="form-control"  placeholder=""> 
								</div> 
								
								<div class="form-group"> 
									<label for="exampleInputEmail1">Manpower</label> 
									<input type="text" name="mnreqrd" class="form-control"  placeholder="Manpower Required"> 
								</div> 
								
			
			 <div class="form-group">
			<div><label for="selector1" class="col-sm-2 control-label">Add responsible Department</label></div>
			<div class="col-sm-8"><select name="rsdpt" id="selector1" class="form-control1" >
									
			<%try{
				Connection con = ConnectsDB.getConnect();
			  	/*int id   = Integer.parseInt(request.getParameter("id"));
				UserData.setPid(id);*/

				PreparedStatement ps7 = con.prepareStatement("select department from deptdetails");
				ResultSet rst = ps7.executeQuery();
				while(rst.next()){
				%>
							<option><%=rst.getString("department")%></option>
				<%
					}
					}catch(Exception e)
			{
						
					e.printStackTrace()	;
					
			}
				%>		
						
			</select></div>		
									
			
			<div class="clearfix"> </div>
</div>
			
			<div class="form-group"> 
			<label for="exampleInputEmail1">Plan Image:</label> 
			</div>
						
				<div class="form-group">
				 	<input type="file" id="exampleInputFile"> 
						 	</div>
						<button type="submit" class="btn btn-default">Create</button> 
					</form> 
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