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

/**
 * Servlet implementation class UpdateFarmerServlet
 */
@WebServlet("/UpdateFarmerServlet")
public class UpdateFarmerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BLManager bl=new BLManager();
       Farmer f=new Farmer();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFarmerServlet() {
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
		PrintWriter out=response.getWriter();
		//System.out.println(id);
		//int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		String fgender=request.getParameter("fgender");
		String femail=request.getParameter("femail");
		//Part image=request.getPart("image");
		String fusername=request.getParameter("fusername");
		String fpassword=request.getParameter("fpassword");
		String country=request.getParameter("country");
		
		
		
	//	f.setFid(id);
		f.setFname(fname);
		f.setFgender(fgender);
		f.setFemail(femail);
		f.setFusername(fusername);
		f.setFpassword(fpassword);
		f.setCountry(country);
        
        bl.UpdateFarmer(f);
    
        out.print("<script type=\"text/javascript\">");
		out.print("alert('Record updated successfully....');");
		out.print("location='FarmerMenu1.jsp';");
		out.print("</script>");
	}

}
