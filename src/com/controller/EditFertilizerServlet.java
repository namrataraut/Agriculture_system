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
import com.pojo.Fertilizer;

/**
 * Servlet implementation class EditFertilizerServlet
 */
@WebServlet("/EditFertilizerServlet")
public class EditFertilizerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Fertilizer fer=new Fertilizer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFertilizerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ferid=request.getParameter("ferid");
		int id1=Integer.parseInt(ferid);
		
		fer=bl.FertilizerSearchById(id1);
		
		
		HttpSession ss=request.getSession();
		ss.setAttribute("list",fer);
		
	 response.sendRedirect("updateFertilizer.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String fername=request.getParameter("fername");
        String ferdescription=request.getParameter("ferdescription");
        String ferrate=request.getParameter("ferrate");
        String ferquantity=request.getParameter("ferquantity");
        
        fer.setFername(fername);
        fer.setFerdescription(ferdescription);
        fer.setFerrate(ferrate);
        fer.setFerquantity(ferquantity);
		
		bl.update(fer);
		
		out.print("<script type=\"text/javascript\">");
		out.print("alert('successfully updated!!!....');");
		out.print("location='updateFertilizer.jsp';");
		out.print("</script>");
	
	}

}
