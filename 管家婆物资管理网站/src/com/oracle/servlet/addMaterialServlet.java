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
		// 1 ��������
				DiskFileItemFactory factory = new DiskFileItemFactory();
			// ������������
				ServletFileUpload fileUpload = new ServletFileUpload(factory);
				
				fileUpload.setHeaderEncoding("utf-8");// �����������
				//ʹ�ý�����������request����
				//����һ������������е���������
				ArrayList<String> listMaterial=new ArrayList<String>() ;
				      try {
						List<FileItem> list = fileUpload.parseRequest(request);
						               for (FileItem fileItem : list) {
										  if(fileItem.isFormField()){
												  // ��ͨ����
													// ��ȡ��ǰ������ֶ�����
													String fieldName = fileItem.getFieldName();
													String value=fileItem.getString("utf-8");// ��ȡ���Ե�ֵ
													//�����ݴ������ּ�����
													listMaterial.add(value);
													
							
										 }else{
													
													
													String name = fileItem.getName();//��ȡ�ϴ��ļ�������
													// ����ϴ����ļ�����Ϊ�գ���û��ָ���ϴ��ļ�
													//System.out.println(name+"name");
													if(name == null || name.isEmpty()) {
														continue;
													}
												String savepath = this.getServletContext().getRealPath("/materialImg");
												//System.out.println(savepath);
												// ��������ļ��ϴ����⣺  �����µ��ļ���
												String uuid = CommonUtils.uuid();//����uuid
												String filename = uuid + "_" + name;//�µ��ļ�����Ϊuuid + �»��� + ԭʼ����
												//���µ��ļ����ִ������ּ�����
												listMaterial.add(filename);
												
												 
												//�����ݽ������ݿ��ʱ�����ͼƬ
												
												File file = new File(savepath, filename);
												try {
													fileItem.write(file);
													
												} catch (Exception e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}//���ϴ��ļ����浽ָ��λ��								
										  }	
										 
						               }

					} catch (FileUploadException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}										
				   InputStream in = request.getInputStream();
				    String s = IOUtils.toString(in);//ʹ��apache��commons��io����������е����ݶ�ȡ����ת�����ַ���
				    
				    //����MaterialService�Ķ���
					MaterialService ms=new MaterialService();
					int no=0;
					try {
						 no=ms.AddMaterial(listMaterial);
						if(no>0){
							JOptionPane.showMessageDialog(null, "��ӳɹ�");
						}else{
							JOptionPane.showMessageDialog(null, "���ʧ��");
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
