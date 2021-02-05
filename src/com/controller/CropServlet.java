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

/**
 * Servlet implementation class CropServlet
 */
@WebServlet("/CropServlet")
public class CropServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bm = new BLManager();
	Crop c = new Crop();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CropServlet() {
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
        
        String cname=request.getParameter("cname");
        String cprice=request.getParameter("cprice");
        String cquantity=request.getParameter("cquantity");
        String ctype=request.getParameter("ctype");
        
          c.setCname(cname);
          c.setCprice(cprice);
          c.setCquantity(cquantity);
          c.setCtype(ctype);

  		 bm.save(c);
          
        	  out.print("<script type=\"text/javascript\">");
      		out.print("alert('record saved!!!....');");
      		out.print("location='Crop.jsp';");
      		out.print("</script>");
	}


}
