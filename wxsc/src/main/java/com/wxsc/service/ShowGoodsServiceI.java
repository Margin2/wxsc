package com.wxsc.service;

import java.util.List;

import com.wxsc.bean.GOODS_COMMENT;
import com.wxsc.bean.GOODS_INFO;
import com.wxsc.bean.GOODS_INTRODUCE;

public interface ShowGoodsServiceI {
	/**
	 * ȡ��ĳһ������е���Ʒ
	 */
	public List<GOODS_INFO> showAll(String goodsClass);

	/**
	 * ȡ����Ʒ�ķ���
	 */
	public String getGoodsClass();
	/**�õ���Ʒ��ͼƬ����ϸ��Ϣ*/
	public String getDescription(String goodsid);

}
