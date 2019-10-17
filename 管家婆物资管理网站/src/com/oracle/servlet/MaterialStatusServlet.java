package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.oracle.entity.Record;

import com.oracle.service.AddRecordService;
import com.oracle.service.MaterialStatusService;

public class MaterialStatusServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MaterialStatusServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取物资ID 和 状态
		String id = request.getParameter("material_id");
		//转型
		 int material_id = Integer.parseInt(id);
		 
		String status = request.getParameter("status");
		
		MaterialStatusService ms = new MaterialStatusService();
		int no=-2;
		 try {
			no = ms.updateMaterialStatus(material_id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //判断图书信息是否借出
		 if(no==-1){
			 request.getRequestDispatcher("Boss.jsp").forward(request, response);
				JOptionPane.showMessageDialog(null, "图书已被借出"); 
			 
		 }else{ 
			 //获取用户ID
			 HttpSession session = request.getSession();
	        String user_id = session.getAttribute("user_id").toString();  
			   //去生成借出时间
			 Date date = new Date();
			 SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
			 //System.out.println(dateFormat.format(date));
			 String loan_time = dateFormat.format(date);
			 //借出理由
           String record_reason = request.getParameter("record_reason");
      		 Record record = new Record(user_id,loan_time,record_reason,material_id);
      		AddRecordService records = new AddRecordService();
      		int addRecord=-1;
           try {
			 addRecord = records.addRecord(record);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            if(addRecord>0){
            	 request.getRequestDispatcher("storehouseUser.jsp").forward(request, response);
     			
            } 
           
           
           
           
			
			 
		 }

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
