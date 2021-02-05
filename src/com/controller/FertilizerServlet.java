package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Fertilizer;

/**
 * Servlet implementation class FertilizerServlet
 */
@WebServlet("/FertilizerServlet")
public class FertilizerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager blm=new BLManager();
	Fertilizer fr=new Fertilizer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FertilizerServlet() {
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
        
        String fername=request.getParameter("fername");
        String ferdescription=request.getParameter("ferdescription");
        String ferrate=request.getParameter("ferrate");
        String ferquantity=request.getParameter("ferquantity");
        
          fr.setFername(fername);
       fr.setFerdescription(ferdescription);
         fr.setFerrate(ferrate);
         fr.setFerquantity(ferquantity);

  		 blm.saveFertilizer(fr);
          
        	  out.print("<script type=\"text/javascript\">");
      		out.print("alert('record saved!!!....');");
      		out.print("location='Fertilizer.jsp';");
      		out.print("</script>");
        	
        			
        		}

	}

