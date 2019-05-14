package tech.aistar.day04;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.mapper.OrdersMapper;
import tech.aistar.day04.mapper.UserMapper;
import tech.aistar.day04.vo.OrdersCustomVo;
import tech.aistar.day04.vo.OrdersQueryVo;
import tech.aistar.day04.vo.UserCustomVo;
import tech.aistar.util.MyBatisUtil;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class UserMapperTest {
    @Test
    public void testFindById(){
        SqlSession sqlSession = MyBatisUtil.getSession();
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserCustomVo queryVo = mapper.findById(1);

        System.out.println(queryVo);

        queryVo.getOrdersCustomsVos().forEach(System.out::println);

        queryVo.getOrdersCustomsVos().forEach(o -> System.out.println(o.getOrdersDetailCustomVos()));
    }
}
