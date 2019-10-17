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

public class ForgetServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ForgetServlet() {
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
		PrintWriter out = response.getWriter();

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
		PrintWriter out = response.getWriter();
		// 获取信息
		String user_id = request.getParameter("user_id");
		String user_name = request.getParameter("user_name");
		String user_phone = request.getParameter("user_phone");
		//System.out.println(user_id+"***"+user_name+"**"+user_phone);
		// 封装
		User user = new User(user_id, user_name, user_phone);
		// 连接LoginService业务层
		LoginService ls = new LoginService();
		User us = null;
		try {
			us = ls.ForgetService(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 1.验证信息是否正确 2.创建Session
		 */
		HttpSession session = request.getSession();
		if (us.getUser_id().equals(user_id)
				&& us.getUser_name().equals(user_name)
				&& us.getUser_phone().equals(user_phone)) {
			// 存入Session
			session.setAttribute("user", us);
			request.getRequestDispatcher("Forgets.jsp").forward(request,
					response);
			JOptionPane.showMessageDialog(null, "验证成功");
		} else {
			request.getRequestDispatcher("Forget.jsp").forward(request,
					response);
			JOptionPane.showMessageDialog(null, "信息有误");
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
