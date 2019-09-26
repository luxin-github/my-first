package com.aistar.service.impl;

import com.aistar.pojo.Coupon;
import com.aistar.service.CouponService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CouponServiceImpl implements CouponService {
    @Override
    public Coupon getById(int id) {
        Coupon coupon = new Coupon();

        coupon.setCouponId(id);
        coupon.setCouponName("满50减20券");
        coupon.setCouponStartday(new Date(2019-1900,9-1,20));
        coupon.setCouponEndday(new Date(2019-1900,9-1,25));
        coupon.setCouponMoney(20);
        coupon.setFullMoney(50);
        coupon.setCouponStatus("0");

        return coupon;
    }
}
