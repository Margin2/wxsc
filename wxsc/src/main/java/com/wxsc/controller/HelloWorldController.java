package com.wxsc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.wxsc.service.ShowGoodsServiceI;
@Controller
public class HelloWorldController {  
	//@Autowired
	//private ShowGoodsServiceI showGoodsService;
	
       
        @RequestMapping(value="/testHtml")
        public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {       	
        	 //showGoodsService.showAll("12");
            //1���ռ���������֤����  
            //2���󶨲������������  
            //3�������������ҵ��������ҵ����  
            //4��ѡ����һ��ҳ��  
            ModelAndView mv = new ModelAndView();  
            //���ģ������ �����������POJO����  
            mv.addObject("message", "��� World!");  
            //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
            mv.setViewName("g_content");  
          System.out.println("����helloworld");
            return mv;  
        }

		 
    } 