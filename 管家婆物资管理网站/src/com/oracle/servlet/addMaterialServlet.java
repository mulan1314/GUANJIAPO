package com.oracle.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.oracle.service.MaterialService;

public class addMaterialServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public addMaterialServlet() {
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

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		// 1 创建工厂
				DiskFileItemFactory factory = new DiskFileItemFactory();
			// 创建解析对象
				ServletFileUpload fileUpload = new ServletFileUpload(factory);
				
				fileUpload.setHeaderEncoding("utf-8");// 解决中文乱码
				//使用解析器来解析request对象
				//创建一个集合来存表单中的文字数据
				ArrayList<String> listMaterial=new ArrayList<String>() ;
				      try {
						List<FileItem> list = fileUpload.parseRequest(request);
						               for (FileItem fileItem : list) {
										  if(fileItem.isFormField()){
												  // 普通表单项
													// 获取当前表单项的字段名称
													String fieldName = fileItem.getFieldName();
													String value=fileItem.getString("utf-8");// 获取属性的值
													//将数据存入文字集合中
													listMaterial.add(value);
													
							
										 }else{
													
													
													String name = fileItem.getName();//获取上传文件的名称
													// 如果上传的文件名称为空，即没有指定上传文件
													//System.out.println(name+"name");
													if(name == null || name.isEmpty()) {
														continue;
													}
												String savepath = this.getServletContext().getRealPath("/materialImg");
												//System.out.println(savepath);
												// 解决重名文件上传问题：  生成新的文件名
												String uuid = CommonUtils.uuid();//生成uuid
												String filename = uuid + "_" + name;//新的文件名称为uuid + 下划线 + 原始名称
												//将新的文件名字存入文字集合中
												listMaterial.add(filename);
												
												 
												//当数据进入数据库的时候，添加图片
												
												File file = new File(savepath, filename);
												try {
													fileItem.write(file);
													
												} catch (Exception e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}//把上传文件保存到指定位置								
										  }	
										 
						               }

					} catch (FileUploadException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}										
				   InputStream in = request.getInputStream();
				    String s = IOUtils.toString(in);//使用apache的commons的io组件，把流中的数据读取出来转换成字符串
				    
				    //创建MaterialService的对象
					MaterialService ms=new MaterialService();
					int no=0;
					try {
						 no=ms.AddMaterial(listMaterial);
						if(no>0){
							JOptionPane.showMessageDialog(null, "添加成功");
						}else{
							JOptionPane.showMessageDialog(null, "添加失败");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
