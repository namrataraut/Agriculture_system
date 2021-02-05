package com.controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;


import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Part;

import com.model.BLManager;
import com.pojo.Machine;

/**
 * Servlet implementation class MachineServlet
 */
@WebServlet("/MachineServlet")
@MultipartConfig(fileSizeThreshold=1024 * 1024 * 2,
maxFileSize = 1024 * 1024 * 70,
maxRequestSize = 1024 * 1024 * 100)
public class MachineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String SAV_DIR="E://MCAfinalyr/AgricultureSystem/WebContent/img";
	BLManager blm=new BLManager();
	Machine m=new Machine();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MachineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.setContentType("image/jpeg");
		ServletOutputStream o;
        o=response.getOutputStream();
        FileInputStream fin=new FileInputStream("images/Tractor-600x361.jpg");
        BufferedInputStream bin=new BufferedInputStream(fin);
        BufferedOutputStream bout=new BufferedOutputStream(o);
        int ch=0;
        while((ch=bin.read())!=-1){
        	bout.write(ch);
        }
        bin.close();
        fin.close();
        bout.close();
        o.close();*/
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		
        PrintWriter out=response.getWriter(); 
        
        String mname=request.getParameter("mname");
        String mdescription=request.getParameter("mdescription");
       //String mimage=request.getParameter("mimage");
       Part mimage=request.getPart("mimage");
        
        
          m.setMname(mname);
        m.setMdescription(mdescription);
        //m.setMimage(mimage);
        try{
        	String img1=extractFileName(mimage);
        	m.setMimage(img1);
        }
        catch(Exception e)
{ 
	e.printStackTrace();
}
  

        blm.saveMachine(m);
		out.print("<script type=\"text/javascript\">");
		out.print("alert('Machine is added');");
		out.print("location='Machine.jsp';");
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


