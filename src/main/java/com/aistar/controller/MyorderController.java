package com.aistar.controller;

import com.aistar.service.CouponHaveService;
import com.aistar.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class MyorderController {
    @Autowired
    private MyOrderService myOrderService;
    @Autowired
    private CouponHaveService couponHaveService;
    @PostMapping("save")
    public void save(HttpServletRequest request){
        //获得订单的基本信息
        String custIdStr = request.getParameter("custId");//下单人id
        Date orderDate = new Date();//下单时间
        String addrStr = request.getParameter("addrId");// 收件地址

        String haveId = request.getParameter("haveId");//优惠券id


    }
}
