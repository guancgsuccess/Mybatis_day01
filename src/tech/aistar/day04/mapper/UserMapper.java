package tech.aistar.day04.mapper;

import tech.aistar.day04.vo.UserCustomVo;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public interface UserMapper {

    /**
     * 级联查询出该用户的所有的信息
     * @param id
     * @return
     */
    UserCustomVo findById(Integer id);

    /**
     * 根据用户的id进行查询,延迟加载出该用户的订单信息.

     如果只使用到了user对象,那么就不会发送查询订单的sql语句.如果使用到了关联对象.那么才会发送查询

     订单的sql语句.按需加载.
     * @param id
     * @return
     */
    UserCustomVo getUserAndOrderByIdLazy(Integer id);
}
