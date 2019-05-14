package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orderdetail;
import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.entity.User;

import java.util.List;
import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersCustomVo extends Orders {
    //多个订单对应一个客户
    private User user;

    //一个订单对应多个订单明细
    private Set<Orderdetail> orderdetailSet;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setOrderdetailSet(Set<Orderdetail> orderdetailSet) {
        this.orderdetailSet = orderdetailSet;
    }

    public Set<Orderdetail> getOrderdetailSet() {
        return orderdetailSet;
    }
}
