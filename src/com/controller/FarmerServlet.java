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
import com.pojo.Farmer;

/**
 * Servlet implementation class FarmerServlet
 */
@WebServlet("/FarmerServlet")
public class FarmerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Farmer f=new Farmer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmerServlet() {
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
		
		String email = request.getParameter("femail");

		String passsword = request.getParameter("fpasssword");
		
		f=bl.serachbyemail(email);

		System.out.println("femail" +email + passsword );

		System.out.println("Emailid is" +f.getFemail());
		
          PrintWriter out = response.getWriter();

              if (f != null) {

	String fname = f.getFname();
	String femail=f.getFemail();
	String fpassword=f.getFpassword();
	String fusername=f.getFusername();
	String fgender=f.getFgender();
	String fcountry=f.getCountry();
	

	HttpSession session = request.getSession();

	
	session.setAttribute("fname",fname);

	session.setAttribute("femail",femail);
	
	session.setAttribute("fpassword", fpassword);
	session.setAttribute("fusername", fusername);

	session.setAttribute("fgender", fgender);
	
	
	session.setAttribute("fcountry",fcountry);
	
	
	out.print("<script type=\"text/javascript\">");
	out.print("alert('welcome To Agriculture World');");
	out.print("location='home.html';");

//	out.print("location='adminDashboard.jsp';");
	out.print("</script>");

} else {
	out.print("<script type=\"text/javascript\">");
	out.print("alert('Enter correct username && password');");
	out.print("location='editfarmer.jsp';");
	out.print("</script>");
}}
}