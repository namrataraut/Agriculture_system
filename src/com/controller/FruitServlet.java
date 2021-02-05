package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Crop;
import com.pojo.Fruits;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bm = new BLManager();
	Fruits f = new Fruits();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FruitServlet() {
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
        
        String name=request.getParameter("fruitname");
        String quantity=request.getParameter("fruitquantity");
        String price=request.getParameter("fruitpriceperkg");
       
        String state=request.getParameter("state");
        String city=request.getParameter("city");
        
         f.setFruitname(name);
         f.setFruitquantity(quantity);
         f.setFruitpriceperkg(price);
         f.setState(state);
         f.setCity(city);

  		 bm.saveFruit(f);
          
        	  out.print("<script type=\"text/javascript\">");
      		out.print("alert('Done Successfully!!!....');");
      		out.print("location='Fruits.jsp';");
      		out.print("</script>");
	

	}

}
