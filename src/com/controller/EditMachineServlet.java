package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.model.BLManager;
import com.pojo.Fertilizer;
import com.pojo.Machine;

/**
 * Servlet implementation class EditMachineServlet
 */
@WebServlet("/EditMachineServlet")
@MultipartConfig(fileSizeThreshold=1024 * 1024 * 2,
maxFileSize = 1024 * 1024 * 70,
maxRequestSize = 1024 * 1024 * 100)
public class EditMachineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Machine m=new Machine();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMachineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String mid=request.getParameter("mid");
		int id1=Integer.parseInt(request.getParameter("mid"));
		
		m=bl.MachineSearchById(id1);
		
		
		HttpSession ss=request.getSession();
		ss.setAttribute("list",m);
		
	 response.sendRedirect("updateMachine.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String mname=request.getParameter("mname");
		String mdescription=request.getParameter("mdescription");
		
		Part mimage=request.getPart("mimage");
        
        
        m.setMname(mname);
      m.setMdescription(mdescription);
      
      try{
      	String img1=extractFileName(mimage);
      	m.setMimage(img1);
      }
      catch(Exception e)
{ 
	e.printStackTrace();
}


      bl.update(m);
		out.print("<script type=\"text/javascript\">");
		out.print("alert('successfully updated');");
		out.print("location='updateMachine.jsp';");
		out.print("</script>");
		
     }
	private String extractFileName(Part image) {
		String contentDisp = image.getHeader("content-disposition");
	String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
		}
		}
		
		return "";

	}

}
