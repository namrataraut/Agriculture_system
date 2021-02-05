package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        
        if(name.equals("admin")&& password.equals("admin123"))
        {
        	out.print("<script type=\"text/javascript\">");
    		out.print("alert('successfully logged in!!!....');");
    		out.print("location='home2.html';");
    		out.print("</script>");
        }
        else
        {  
        	//
            //out.print("sorry, name or password error!"); 
        	out.print("<script type=\"text/javascript\">");
    		out.print("alert('wrong username or password!!!....');");
    		out.print("location='AdminLogin.jsp';");
    		out.print("</script>");
            
           
          
        }
          
        out.close();  
    
}
}


