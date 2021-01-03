package com.wanghui.design.pattern.jdk_dynamic_proxy.service;

import com.wanghui.design.pattern.jdk_dynamic_proxy.dao.OrderDao;
import com.wanghui.design.pattern.jdk_dynamic_proxy.entry.Order;

public class OrderServiceImpl implements IOrderService {

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        return new OrderDao().insert(order);
    }

}
