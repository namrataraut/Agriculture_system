package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Machine;

/**
 * Servlet implementation class DeleteMachineServlet
 */
@WebServlet("/DeleteMachineServlet")
public class DeleteMachineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Machine m=new Machine();
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMachineServlet() {
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
		
		String mid=request.getParameter("mid");
		int id1=Integer.parseInt(mid);
		
		m=bl.MachineSearchById(id1);
		bl.delete(m);
		out.print("<script type=\"text/javascript\">");
		out.print("alert('Record deleted');");
		out.print("location='ViewMachines.jsp';");
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
