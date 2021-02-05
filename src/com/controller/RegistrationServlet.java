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
import com.pojo.Farmer;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager blm=new BLManager();
	Farmer f=new Farmer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
//		String id=request.getParameter("fid");
//		int id1=Integer.parseInt(id);
		PrintWriter out=response.getWriter();
		String name=request.getParameter("fname");
		String gender=request.getParameter("fgender");
		String email=request.getParameter("femail");
		String username=request.getParameter("fusername");
		String password=request.getParameter("fpassword");
		String country=request.getParameter("country");
		
		f.setFname(name);
		f.setFgender(gender);
		f.setFemail(email);
		f.setFusername(username);
		f.setFpassword(password);
		f.setCountry(country);
	blm.SaveFarmer(f);
		
		
		/*try{
			Class.forName("com.mysql.jdbc.Driver");
		
 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agricultureproject","root","");
		  Statement st=con.createStatement();
		 
		 int i=st.executeUpdate("insert into farmer(fname,fgender,femail,fusername,fpassword,country)values('"+ name+ "','"+gender+ "','" +email+ "','" +username+ "','" +password+ "','" +country+ "')");*/
		
			 out.print("<script type=\"text/javascript\">");
	    		out.print("alert('successfully submitted!!!....');");
	    		out.print("location='index.html';");
	    		out.print("</script>");
		 }
		 
		 /*else {
			 out.print("<script type=\"text/javascript\">");
	    		out.print("alert('wrong username or password!!!....');");
	    		out.print("location='Farmer.jsp';");
	    		out.print("</script>");
		 }*/
		/*}catch(Exception e){
			e.printStackTrace();}*/
		}
		
	
