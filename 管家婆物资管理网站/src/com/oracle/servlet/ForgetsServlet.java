package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.oracle.entity.User;
import com.oracle.service.LoginService;

public class ForgetsServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ForgetsServlet() {
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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
  HttpSession sion = request.getSession();
  User  users  = (User)sion.getAttribute("user");
  String user_id = users.getUser_id();
		PrintWriter out = response.getWriter();
		// 获取信息	
		String user_password = request.getParameter("user_password");
		
	
		System.out.println(user_password);
		System.out.println(user_id);
		// 封装
		User user = new User(user_password);
		// 连接LoginService业务层
		LoginService ls = new LoginService();
		int us=0;
		try {
			us = ls.ForgetsService(user,user_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 1.验证信息是否正确 2.创建Session
		 */
		HttpSession session = request.getSession();
		if (us>0) {
			// 存入Session
			session.setAttribute("user", us);
			request.getRequestDispatcher("login.jsp").forward(request,
					response);
			JOptionPane.showMessageDialog(null, "修改成功");
		} else {
			request.getRequestDispatcher("Forget.jsp").forward(request,
					response);
			JOptionPane.showMessageDialog(null, "設置失敗");
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
