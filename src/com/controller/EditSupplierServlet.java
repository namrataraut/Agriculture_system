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
import com.pojo.Supplier;

/**
 * Servlet implementation class EditSupplierServlet
 */
@WebServlet("/EditSupplierServlet")
public class EditSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Supplier s=new Supplier();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditSupplierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=request.getParameter("sid");
		int id1=Integer.parseInt(sid);
		
		s=bl.SupplierSearchById(id1);
		
		
		HttpSession ss=request.getSession();
		ss.setAttribute("list",s);
		
	 response.sendRedirect("updateSupplier.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("sname");
		String semail=request.getParameter("semail");
		String spassword=request.getParameter("spassword");
        String saddress=request.getParameter("saddress");
        String sphone=request.getParameter("sphone");
         String scompany=request.getParameter("scompany");
         s.setSname(sname);
         s.setSemail(semail);
         s.setSpassword(spassword);
         s.setSaddress(saddress);
         s.setSphone(sphone);
         s.setScompany(scompany);
        
         
		
		bl.update(s);
		
		out.print("<script type=\"text/javascript\">");
		out.print("alert('successfully updated!!!....');");
		out.print("location='updateSupplier.jsp';");
		out.print("</script>");
	}

}
