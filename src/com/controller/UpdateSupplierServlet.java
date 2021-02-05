package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Farmer;
import com.pojo.Supplier;

/**
 * Servlet implementation class UpdateSupplierServlet
 */
@WebServlet("/UpdateSupplierServlet")
public class UpdateSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 BLManager bl=new BLManager();
     Supplier s=new Supplier();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSupplierServlet() {
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
		PrintWriter out=response.getWriter();
		String id=request.getParameter("sid");
		int sid=Integer.parseInt(id);
		String sname=request.getParameter("sname");
		String semail=request.getParameter("semail");
		String spassword=request.getParameter("spassword");
		//Part image=request.getPart("image");
		String saddress=request.getParameter("saddress");
		String sphone=request.getParameter("sphone");
		String scompany=request.getParameter("scompany");
		
		
		
		s.setSid(sid);
		s.setSname(sname);
		s.setSemail(semail);
		s.setSpassword(spassword);
		s.setSaddress(saddress);
		s.setSphone(sphone);
		s.setScompany(scompany);
        
        bl.UpdateSupplier(s);
    
        out.print("<script type=\"text/javascript\">");
		out.print("alert('Record update successfully....');");
		out.print("location='EditSupplier.jsp';");
		out.print("</script>");
	}

	}

