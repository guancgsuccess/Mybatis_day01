package tech.aistar.day04;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.mapper.OrdersMapper;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersQueryVo;
import tech.aistar.util.MyBatisUtil;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersMapperTest {
    @Test
    public void testGetById(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersQueryVo queryVo = mapper.getById(4);

        System.out.println(queryVo);

        System.out.println(queryVo.getUid()+":"+queryVo.getUsername());
    }

    @Test
    public void testFindById(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersCustomVo queryVo = mapper.findById(4);

        System.out.println(queryVo);

        System.out.println(queryVo.getUser());
    }

    @Test
    public void testFindByIdAndDetails(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersCustomVo queryVo = mapper.findByOrderIdAndDetails(3);

        System.out.println(queryVo);

        queryVo.getOrderdetailSet().forEach(System.out::println);
    }
}
