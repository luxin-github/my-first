package com.aistar.service;

import com.aistar.pojo.Coupon;
import com.aistar.pojo.CouponHave;

import java.util.List;

public interface CouponHaveService {

    /**
     * 根据id查询用户优惠券
     * @param id 用户拥有的优惠券的id
     * @return
     */
    public CouponHave getById(int id);

    /**
     * 查询用户拥有的所有优惠券
     * @param custId
     * @return
     */
    public List<CouponHave> getByCustId(int custId);

    /**
     * 查询用户某一状态下的优惠券
     * @param custId 用户id
     * @param status 状态码
     * @return
     */
    public List<CouponHave> getByCustId(int custId,int status);

    /**
     * 查询用户所有可用的优惠券并按照优惠金额降序排序
     * @param custId 用户id
     * @param money 订单原价
     * @return 可用优惠券列表
     */
    public List<Coupon> getAllCanUse(int custId, double money);


}
