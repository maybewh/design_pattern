package com.wanghui.design.pattern.jdk_dynamic_proxy.dao;

import com.wanghui.design.pattern.jdk_dynamic_proxy.entry.Order;

public class OrderDao {

    public int insert(Order order) {
        System.out.println("插入数据库成功");
        return 1;
    }
}
