package com.wxsc.dao;

import java.util.List;

import com.wxsc.bean.GOODS_COMMENT;

public interface GOODS_COMMENTMapper {
	/**ͨ��goodsidɾ����Ʒ����**/
    int deleteByPrimaryKey(String goodsid);
	/**ʵ��������۱�**/
    int insert(GOODS_COMMENT record);
    /**�������ۣ�����insert���η��������ֶλ���mapper�����Ƿ�Ϊ�գ�**/
    int insertSelective(GOODS_COMMENT record);
	/**��goodsid�ĵ���Ʒ����������**/
      List< GOODS_COMMENT> selectByPrimaryKey(String goodsid);   
    /**�޸���Ʒ����**/
    int updateByPrimaryKeyWithBLOBs(GOODS_COMMENT record);

}