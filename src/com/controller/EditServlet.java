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
import com.pojo.Crop;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Crop c=new Crop();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cid=request.getParameter("cid");
		int id1=Integer.parseInt(cid);
		
		c=bl.CropSearchById(id1);
		
		
		HttpSession ss=request.getSession();
		ss.setAttribute("list",c);
		
	 response.sendRedirect("updateCrop.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String cname=request.getParameter("cname");
        String cprice=request.getParameter("cprice");
        String cquantity=request.getParameter("cquantity");
        String ctype=request.getParameter("ctype");
        
          c.setCname(cname);
          c.setCprice(cprice);
          c.setCquantity(cquantity);
          c.setCtype(ctype);
		
		bl.update(c);
		
		out.print("<script type=\"text/javascript\">");
		out.print("alert('successfully updated!!!....');");
		out.print("location='updateCrop.jsp';");
		out.print("</script>");
	}

}
