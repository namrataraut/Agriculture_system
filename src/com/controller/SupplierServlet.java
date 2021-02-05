package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Supplier;

/**
 * Servlet implementation class SupplierServlet
 */
@WebServlet("/SupplierServlet")
public class SupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Supplier s=new Supplier();
	BLManager bl=new BLManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierServlet() {
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
		String email = request.getParameter("semail");

		String passsword = request.getParameter("spasssword");
		
		s=bl.searchbyemail(email);

		System.out.println("semail" +email + passsword );

		System.out.println("Emailid is" +s.getSemail());
		
          PrintWriter out = response.getWriter();

              if (s != null) {

	String sname = s.getSname();
	String semail=s.getSemail();
	String spassword=s.getSpassword();
	String saddress=s.getSaddress();
	String sphone=s.getSphone();
	String scompany=s.getScompany();
	

	HttpSession session = request.getSession();

	
	session.setAttribute("sname",sname);

	session.setAttribute("semail",semail);
	
	session.setAttribute("spassword", spassword);
	session.setAttribute("saddress", saddress);

	session.setAttribute("sphone", sphone);
	
	
	session.setAttribute("scompany",scompany);
	
	
	out.print("<script type=\"text/javascript\">");
	out.print("alert('welcome To Agriculture World');");
	out.print("location='home3.html';");

//	out.print("location='adminDashboard.jsp';");
	out.print("</script>");

} else {
	out.print("<script type=\"text/javascript\">");
	out.print("alert('Enter correct username && password');");
	out.print("location='Supplier.jsp';");
	out.print("</script>");
}}
}