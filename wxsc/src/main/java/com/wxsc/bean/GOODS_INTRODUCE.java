package com.wxsc.bean;

public class GOODS_INTRODUCE {
    private String goodsid;

    private String introduce;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }
     /***
      * �õ���Ʒ�Ľ��ܲ���*/
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}