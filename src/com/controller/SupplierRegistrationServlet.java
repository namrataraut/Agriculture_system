package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Supplier;


@WebServlet("/SupplierRegistrationServlet")
public class SupplierRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager blm=new BLManager();
	Supplier s=new Supplier();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierRegistrationServlet() {
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
		PrintWriter out=response.getWriter();
		String name=request.getParameter("sname");
		String email=request.getParameter("semail");
		String password=request.getParameter("spassword");
		String address=request.getParameter("saddress");
		String phone=request.getParameter("sphone");
		String company=request.getParameter("scompany");
		s.setSname(name);
		s.setSemail(email);
		s.setSpassword(password);
		s.setSaddress(address);
		s.setSphone(phone);
		s.setScompany(company);
		blm.saveSupplier(s);
		/*try{
			Class.forName("com.mysql.jdbc.Driver");
		
 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agricultureproject","root","");
		  Statement st=con.createStatement();
		 
		 int i=st.executeUpdate("insert into supplier(sname,semail,spassword,saddress,sphone,scompany)values('"+ name+ "','"+email+ "','" +password+ "','" +address+ "','" +phone+ "','" +company+ "')");
		
		
		
		 if (i > 0){*/
			 out.print("<script type=\"text/javascript\">");
	    		out.print("alert('successfully submitted!!!....');");
	    		out.print("location='Supplier.jsp';");
	    		out.print("</script>");
		 /*}
		 
		 else {
			 out.print("<script type=\"text/javascript\">");
	    		out.print("alert('wrong username or password!!!....');");
	    		out.print("location='Supplier.jsp';");
	    		out.print("</script>");
	
	}
		}catch(Exception e){e.printStackTrace();}
	}*/
}
}