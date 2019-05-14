package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orderdetail;
import tech.aistar.day04.entity.Orders;

import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersCustomsVo extends Orders{

    //orders->orderDetail
    private Set<OrdersDetailCustomVo> ordersDetailCustomVos;

    public void setOrdersDetailCustomVos(Set<OrdersDetailCustomVo> ordersDetailCustomVos) {
        this.ordersDetailCustomVos = ordersDetailCustomVos;
    }

    public Set<OrdersDetailCustomVo> getOrdersDetailCustomVos() {
        return ordersDetailCustomVos;
    }
}

