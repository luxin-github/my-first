package com.aistar.service;

import com.aistar.pojo.Myorder;

public interface MyOrderService {
    /**
     * 生成订单
     * @param myorder 订单对象
     * @return
     */
    public int save(Myorder myorder);
}
