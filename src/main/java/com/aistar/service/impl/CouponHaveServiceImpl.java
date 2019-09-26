package com.aistar.service.impl;

import com.aistar.mapper.CouponHaveMapper;
import com.aistar.mapper.CouponMapper;
import com.aistar.pojo.Coupon;
import com.aistar.pojo.CouponHave;
import com.aistar.pojo.CouponHaveExample;
import com.aistar.service.CouponHaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class CouponHaveServiceImpl implements CouponHaveService {
    @Autowired
    private CouponMapper couponMapper;
    @Autowired
    private CouponHaveMapper couponHaveMapper;
    @Override
    public CouponHave getById(int id) {
        CouponHave couponHave = new CouponHave();
        couponHave.setCouponId(1);
        couponHave.setCustId(1);
        couponHave.setHaveId(id);
        couponHave.setHaveStatus("0");
        return couponHave;
    }

    @Override
    public List<CouponHave> getByCustId(int custId) {
        List<CouponHave> list = new ArrayList<>();
        CouponHave couponHave = new CouponHave();
        couponHave.setCouponId(1);
        couponHave.setCustId(custId);
        couponHave.setHaveId(1);
        couponHave.setHaveStatus("0");
        list.add(couponHave);
        return list;
    }

    @Override
    public List<CouponHave> getByCustId(int custId, int status) {
        return null;
    }

    @Override
    public List<Coupon> getAllCanUse(int custId, double money) {

        CouponHaveExample couponHaveExample = new CouponHaveExample();
        CouponHaveExample.Criteria criteria = couponHaveExample.createCriteria();
        criteria.andCustIdEqualTo(custId);// 某一用户的
        criteria.andHaveStatusEqualTo(0);// 未使用的
        List<CouponHave> list = couponHaveMapper.selectByExample(couponHaveExample);// custId用户的未使用的优惠券列表

        // 根据每一个优惠券id查询优惠券是否符合要求，符合要求就add到couponList里
        List<Coupon> couponList = new ArrayList<>();
        Iterator<CouponHave> it = list.iterator();
        while (it.hasNext()) {
            CouponHave couponHave = it.next();
            Coupon coupon = couponMapper.selectByPrimaryKey(couponHave.getCouponId());// 拥有的优惠券id所对应的优惠券id
            if (couponTime(coupon.getCouponStartday(),coupon.getCouponEndday()) && // 在使用时间内
                    coupon.getFullMoney()<=money ){// 满足满减要求
                couponList.add(coupon);
            }
        }
        // 优化，使优惠金额从大到小排序，方便用户选择
        sortByMoney(couponList);

        return couponList;
    }
}
