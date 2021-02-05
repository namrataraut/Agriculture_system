
<%@page import="com.model.BLManager" %>
<%@page import="com.pojo.Supplier" %>
<%@page import="java.util.*"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <%
BLManager bl=new BLManager();
Supplier s=new Supplier();
String semail=(String)session.getAttribute("semail");
System.out.print("Before ID:"+semail);
s=bl.searchbyemail(semail);
//System.out.print("After ID:"+r.getId());
request.setAttribute("s", s);

session.getAttribute("sname");
session.getAttribute("semail");
session.getAttribute("spassword");
session.getAttribute("saddress");
session.getAttribute("sphone");
session.getAttribute("scompany");

%>

<table border="1" width="20%" cellpadding="2">

<div class="content" >
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-10">
				<div class="card">
					<div class="header">
						<h4 class="title">Edit profile</h4>
						<div class="content">
							
							 
							  <form action="UpdateSupplierServlet" method="post"> 

							 
								<div class="row">
								
								<input type="hidden" name="sid" value="${s.sid }">
								
								<div class="col-md-8">
										<div class="form-group">
											<label>Name:</label> <input type="text" 
												class="form-control" name="sname" 
												placeholder="sname" value="${s.sname}">
										</div>
									</div>
									
								<div class="col-md-8">
										<div class="form-group">
											<label>Email:</label> <input type="text" 
												class="form-control" name="semail" 
												placeholder="f@gmail.com" value="${s.semail}">
										</div>
									</div>
									
									<div class="col-md-8">
										<div class="form-group">
											<label>Password:</label> <input type="text" 
												class="form-control" name="spassword" 
												placeholder="*******" value="${s.spassword}">
										</div>
									</div>
									
									<div class="col-md-8">
										<div class="form-group">
<label>Address:</label> <input type="text" class="form-control" name="saddress" 
placeholder="Pune" value="${s.saddress}">
										</div>
									</div>
											
											<div class="col-md-8">
										<div class="form-group">
											<label>Phone:</label> <input type="text" 
												class="form-control" name="sphone" 
												placeholder="9890453627" value="${s.sphone}">
										</div>
									</div>
									
									
									
									
																		
									
											<div class="col-md-8">
										<div class="form-group">
											<label>Company:</label> <input type="text" 
												class="form-control" name="scompany" 
												placeholder="Global services" value="${s.scompany}">
										</div>
									</div>
									
									
					<button type="submit" class="btn btn-info btn-fill pull-right/editsupplierprofile.jsp">Update profile</button>
								<a href="SupplierMenu.jsp">Back</a>
								<div class="clearfix"></div>
								
								
							
						</form>
					
					  </div>
					 </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</table>
							

