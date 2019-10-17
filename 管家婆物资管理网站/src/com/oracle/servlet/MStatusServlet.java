package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.entity.Material;
import com.oracle.entity.Type;
import com.oracle.service.MaterialService;
import com.oracle.service.TypeService;

public class MStatusServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MStatusServlet() {
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

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//创建MaterialService的对象
		MaterialService ms=new MaterialService();
		//接收所有物资信息
		List<Material> MList=null;
		
		try {
			MList=ms.FindAllMaterial();
			
			//将数据放入request域中
			request.setAttribute("MList", MList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建TypeService的对象
		TypeService ts=new TypeService();
		//接收类型信息
		List<Type> TList=null;
		try {
			TList=ts.FindAllType();//
			
			//将数据放入Request
			ServletContext ServletContext=this.getServletContext();
			ServletContext.setAttribute("TList", TList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//请求转发页面
		request.getRequestDispatcher("storehouseBoss.jsp").forward(request, response);
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

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//创建MaterialService的对象
		MaterialService ms=new MaterialService();
		//接收所有物资信息
		List<Material> MList=null;
		
		try {
			MList=ms.FindAllMaterial();
			//将数据放入request域中
			request.setAttribute("MList", MList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建TypeService的对象
		TypeService ts=new TypeService();
		//接收类型信息
		List<Type> TList=null;
		try {
			TList=ts.FindAllType();//
			//将数据放入Request
			request.setAttribute("TList", TList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//请求转发页面
		request.getRequestDispatcher("storehouseBoss.jsp");
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
