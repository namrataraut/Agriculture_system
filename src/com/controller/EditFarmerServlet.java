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

/**
 * Servlet implementation class EditFarmerServlet
 */
@WebServlet("/EditFarmerServlet")
public class EditFarmerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Farmer f=new Farmer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFarmerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fid=request.getParameter("id");
		int id1=Integer.parseInt(fid);
		
		f=bl.FarmerSearchById(id1);
		
		
		HttpSession ss=request.getSession();
		ss.setAttribute("list",f);
		
	 response.sendRedirect("updateFarmer.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
        String fgender=request.getParameter("fgender");
        String femail=request.getParameter("femail");
        String fusername=request.getParameter("fusername");
        String fpassword=request.getParameter("fpassword");
        String country=request.getParameter("country");
        
         f.setFname(fname);
         f.setFgender(fgender);
         f.setFemail(femail);
         f.setFusername(fusername);
         f.setFpassword(fpassword);
         f.setCountry(country);
		
		bl.update(f);
		
		out.print("<script type=\"text/javascript\">");
		out.print("alert('successfully updated!!!....');");
		out.print("location='updateFarmer.jsp';");
		out.print("</script>");
	}

	}


