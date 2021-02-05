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
import com.pojo.Farmer;

/**
 * Servlet implementation class DeleteFarmerServlet
 */
@WebServlet("/DeleteFarmerServlet")
public class DeleteFarmerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Farmer f=new Farmer();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFarmerServlet() {
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
		
		String fid=request.getParameter("fid");
		int id1=Integer.parseInt(fid);
		
		f=bl.FarmerSearchById(id1);
		bl.delete(f);
		out.print("<script type=\"text/javascript\">");
		out.print("alert('Record deleted');");
		out.print("location='ViewFarmer.jsp';");
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
