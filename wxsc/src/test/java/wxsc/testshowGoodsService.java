package wxsc;

import java.util.Date;
import java.util.List;
import java.util.UUID;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;
import com.wxsc.service.ShowGoodsServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
//������@ContextConfigurationע�Ⲣʹ�ø�ע���locations����ָ��spring�������ļ�֮��
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class testshowGoodsService{

    //ע��userService
    @Autowired
    private ShowGoodsServiceI userService;
    
    @Test
    public void testAddUser(){
    /*	GOODS_INFO info = new GOODS_INFO();
    	info.setGoodsid("12356");
    	info.setGoodsclass("12");
    	info.setGoodsname("154365");
    	info.setGoodsprice(12.21);
    	//userService.showComment("12");
    	List<GOODS_INFO> list=userService.showAll("�߲�");
      	System.out.println("���ڴ�ӡ���");
    	Gson gson=new Gson();
    	String result=gson.toJson(list);
    	System.out.println("json ���"+result);
    	//��ȡ��Ʒ����   	
    	String intro=gson.toJson(userService.showIntroduce("12"));
    	System.out.println("intro-json ���"+intro);
    	//h��ȡ��Ʒ����
    	String comment=gson.toJson(userService.showComment("12"));
    	System.out.println("comment-json ���"+comment);

    	*/
    	String goodsid="12";
    	userService.getDescription(goodsid);
    	
        
    }
    
    @Test
    public void testGetUserById(){
   
    }
}