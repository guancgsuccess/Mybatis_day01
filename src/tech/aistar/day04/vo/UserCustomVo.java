package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orderdetail;
import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.entity.User;

import java.util.Set;

/**
 * User
 *    Set<Orders> orders
 *
 * Orders
 *    Set<Orderdetail>
 *
 * Item
 *
 * Orderdetail
 *    List<Item> item
 *
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class UserCustomVo extends User {

    //一个用户对应多个订单
    //user->orders
    private Set<OrdersCustomsVo> ordersCustomsVos;

    public Set<OrdersCustomsVo> getOrdersCustomsVos() {
        return ordersCustomsVos;
    }

    public void setOrdersCustomsVos(Set<OrdersCustomsVo> ordersCustomsVos) {
        this.ordersCustomsVos = ordersCustomsVos;
    }
}
