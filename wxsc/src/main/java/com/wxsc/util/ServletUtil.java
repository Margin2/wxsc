package com.wxsc.util;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.test.context.ContextConfiguration;

/**   
* @Title: SessionUtil.java 
* @Package com.teradata.util 
* @Description: session����������
* @date 2016��7��8�� ����3:59:13 
* @version V1.0   
*/
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class ServletUtil extends HttpServlet
{
/**
 * 
 * ���session
 * @return 
 * */
	
	public  void doGet(HttpServletRequest request,HttpServletResponse response)
	{
	
		
		
	}
	public  void doPost(HttpServletRequest request,HttpServletResponse response)
	{
	
		
		
	}  


		
		

	
	
	
	
	
	
/*	public static void setAttribute(String key,Object value){
		getSession(request,response)
		
	}
	*/
	
	
	
	
	/*
	*//**
	 * @param key ��
	 * @param value ���session��ֵ
	 *//*
	
	

	public static  void setAttribute(String key,Object value)
	{
		ServletActionContext.getRequest().getSession().setAttribute(key, value);;
	}
	*//**���ݼ���ȡsession��Ӧֵ
	 * @param key
	 *//*
	public static  Object getAttribute(String key)
	{
		return ServletActionContext.getRequest().getSession().getAttribute(key);
	}
	*//**
	 * @param key
	 * @return request�в���
	 *//*
	public static String getRequestParam(String key){
		return ServletActionContext.getRequest().getParameter(key);
	 }*/
}
