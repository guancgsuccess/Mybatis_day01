package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.entity.User;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersCustomVo extends Orders {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
