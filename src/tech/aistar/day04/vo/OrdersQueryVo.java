package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.entity.User;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersQueryVo extends Orders {
    //两种方案
    //第一种方案将user的信息散列的写在此处
    //配合resultType实现 - 主要是构建出和查询列匹配
    private Integer uid;

    private String username;

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
