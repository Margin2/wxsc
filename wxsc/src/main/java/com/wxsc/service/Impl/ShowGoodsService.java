package com.wxsc.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.wxsc.bean.GOODS_COMMENT;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;
import com.wxsc.dao.GOODS_COMMENTMapper;
import com.wxsc.dao.GOODS_INFOMapper;
import com.wxsc.dao.GOODS_INTRODUCEMapper;
import com.wxsc.service.ShowGoodsServiceI;
@Service("showGoodsService")
public class ShowGoodsService implements ShowGoodsServiceI {

	@Autowired
	 private GOODS_INFOMapper goods_infoMapper;
	@Autowired
	private GOODS_COMMENTMapper  goods_commentMapper;
	@Autowired
	private GOODS_INTRODUCEMapper goods_introduceMapper;
	@Override
	public List<GOODS_INFO> showAll(String goodsClass) {		
		 List<GOODS_INFO> list = goods_infoMapper.selectAllByClass(goodsClass);		 	
		  return list ;
	}


	@Override
	public String getGoodsClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(String goodsId){
		//�õ���Ʒ�۸񣬵�λ����Ϣ
		
		  Gson gson=new Gson();
		  //�õ���Ʒ�Ľ���
		  String gc=gson.toJson(goods_commentMapper.selectByPrimaryKey(goodsId));
		  System.out.println(gc);
		  //�õ���Ʒ������
		  String gi=gson.toJson(goods_introduceMapper.selectByPrimaryKey(goodsId));
		  System.out.println(gi);

		  //�õ���Ʒ�Ļ�����Ϣ
		  String info=gson.toJson(goods_infoMapper.selectByPrimaryKey(goodsId));
	    String description="\"good_info\":"+info
	    		            +",\"introduce\":"+gi
	    		            +",\"comment\":"+gc;
	    System.out.println(description);
		return description;
		
	}

}
