package tech.aistar.day04.mapper;

import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersCustomsVo;
import tech.aistar.day04.vo.OrdersQueryVo;

import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public interface OrdersMapper {

    /**
     * 根据订单的id进行查询,但是需要加载出该订单的用户信息
     * @param id
     * @return
     */
    OrdersQueryVo getById(Integer id);

    OrdersCustomVo findById(Integer id);

    /**
     * 根据订单的id加载出订单信息并且级联加载出该订单的订单明细的信息
     * @param id
     * @return
     */
    OrdersCustomVo findByOrderIdAndDetails(Integer id);

    /**
     * 根据用户的id进行查询
     * @param userid
     * @return
     */
    Set<OrdersCustomsVo> getByUserId(Integer userid);
}
