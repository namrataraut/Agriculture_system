package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Vegetables;

/**
 * Servlet implementation class VegetableServlet
 */
@WebServlet("/VegetableServlet")
public class VegetableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Vegetables v=new Vegetables();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VegetableServlet() {
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
        
        String name=request.getParameter("vegname");
        String quantity=request.getParameter("vegquantity");
        String price=request.getParameter("vegpriceperkg");
       
        String state=request.getParameter("state");
        String city=request.getParameter("city");
        
         v.setVegname(name);
         v.setVegquantity(quantity);
         v.setVegprice(price);
         v.setState(state);
         v.setCity(city);

  		 bl.saveVegetables(v);
          
        	  out.print("<script type=\"text/javascript\">");
      		out.print("alert('Done Successfully!!!....');");
      		out.print("location='Vegetables.jsp';");
      		out.print("</script>");
	
	}

}
