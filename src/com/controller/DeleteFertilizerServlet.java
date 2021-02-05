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
 * Servlet implementation class DeleteFertilizerServlet
 */
@WebServlet("/DeleteFertilizerServlet")
public class DeleteFertilizerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Fertilizer fer=new Fertilizer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFertilizerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String ferid=request.getParameter("ferid");
		int id1=Integer.parseInt(ferid);
		
		fer=bl.FertilizerSearchById(id1);
		bl.delete(fer);
		out.print("<script type=\"text/javascript\">");
		out.print("alert('Record deleted');");
		out.print("location='ViewFertilizer.jsp';");
		out.print("</script>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
