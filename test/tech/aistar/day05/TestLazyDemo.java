package tech.aistar.day05;

import org.junit.Test;
import tech.aistar.day04.mapper.UserMapper;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersCustomsVo;
import tech.aistar.day04.vo.UserCustomVo;
import tech.aistar.util.MyBatisUtil;

import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/15 0015
 */
public class TestLazyDemo {

    @Test
    public void testLazyDeep(){
        UserMapper mapper = MyBatisUtil.getSession().getMapper(UserMapper.class);

        //如果没有使用到关联的对象,那么只会发送查询主对象的sql语句
        UserCustomVo user = mapper.getUserAndOrderByIdLazy(1);

        System.out.println(user);

        //使用关联的对象
       Set<OrdersCustomsVo> orders = user.getOrdersCustomsVos();

       for(OrdersCustomsVo o:orders){
           System.out.println(o);
       }
    }
}
