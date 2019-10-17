package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.oracle.entity.User;
import com.oracle.service.LoginService;

public class Login extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Login() {
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
		// 获取ID 和密码
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
	//	System.out.println(user_id+"*********"+user_password);
		// 封装
		User user = new User(user_id, user_password);
		// 连接Service
		LoginService ls = new LoginService();
		User us=null;		
		try {
			us = ls.LoginService(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/**
	 *   创建Session
	 * 1.首先判断用户名和密码是否是老板的
	 *  2.如果不是在判断账户密码是否正确
	 */
		 HttpSession session = request.getSession();
		if(us.getUser_id().equals("admin")&&us.getUser_password().equals("123")){
			session.setAttribute("user", us); 
			session.setAttribute("user_id ",user_id);
			request.getRequestDispatcher("Boss.jsp").forward(request, response);
			JOptionPane.showMessageDialog(null, "登录成功");
		}else{
			 if(us.getUser_id().equals(user_id)&&us.getUser_password().equals(user_password)){
				 session.setAttribute("user", us);
				 session.setAttribute("user_id ",user_id);
				 request.getRequestDispatcher("User.jsp").forward(request, response);
				 JOptionPane.showMessageDialog(null, "登录成功");
			 }else{
				 request.getRequestDispatcher("Login.jsp").forward(request, response);
				 JOptionPane.showMessageDialog(null, "用户名或密码错误");
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
