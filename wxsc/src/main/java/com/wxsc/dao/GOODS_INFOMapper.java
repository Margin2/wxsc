package com.wxsc.dao;

import java.util.List;


import com.wxsc.bean.GOODS_INFO;

public interface GOODS_INFOMapper {
	/**��idɾ����Ʒ*/
    int deleteByPrimaryKey(String goodsid);
    /**��id������Ʒ,����������ô˷���*/
    int insert(GOODS_INFO record);
    /**ͨ��ʵ�������Ʒ*/
    int insertSelective(GOODS_INFO record);
	/**��id��ѯ��Ʒ*/
    GOODS_INFO selectByPrimaryKey(String goodsid);
    /**��ʵ�������Ʒ*/
    int updateByPrimaryKeySelective(GOODS_INFO record);
	/**��id������Ʒ������������ô˷���*/
    int updateByPrimaryKey(GOODS_INFO record);
	/**��ѯĳ������������Ʒ*/
   
	List<GOODS_INFO> selectAllByClass(String goodsClass);
}