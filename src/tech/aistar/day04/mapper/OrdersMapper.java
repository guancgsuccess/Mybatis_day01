package tech.aistar.day04.mapper;

import tech.aistar.day04.entity.Orders;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersQueryVo;

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

}
