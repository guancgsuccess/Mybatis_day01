package tech.aistar.day05;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day04.mapper.UserMapper;
import tech.aistar.day04.vo.UserCustomVo;
import tech.aistar.util.MyBatisUtil;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/15 0015
 */
public class TestDefaultTwoCache {
    @Test
    public void testTwoCache(){
        //二级缓存跨sqlSession级别的
        //并且是属于mapper级别的
        SqlSession sqlSession = MyBatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //一级和二级缓存中都没有数据,所以会进行sql语句的查询
        //将返回的结果以key - value的方式放入到一级缓存中.
        //并且由于开启了二级缓存.还会将返回的结果放入一份在二级缓存中.
        UserCustomVo u1 = mapper.getUserAndOrderByIdLazy(1);

        System.out.println(u1);
        System.out.println("=============");

        UserCustomVo u2 = mapper.getUserAndOrderByIdLazy(1);

        System.out.println(u2);

        System.out.println("-----------------");

        //sqlSession.clearCache();//清空缓存
        //sqlSession.commit();

        sqlSession.close();

        SqlSession ses = MyBatisUtil.getSession();

        UserMapper um = ses.getMapper(UserMapper.class);

        //优先从一级缓存中去寻找,如果有直接获取,但是一级缓存中并不存在
        //接着从二级缓存中去寻找,二级缓存中有,直接获取.否则和db交互
        UserCustomVo u3 = um.getUserAndOrderByIdLazy(1);
        System.out.println(u3);
        System.out.println("=======");

        //一级缓存的数据结构是hashmap  key value  key - id value - 封装好的对象[user]
        System.out.println(u1 == u2);//true

        //二级缓存是将查询出来的结果key - id和散列的数据存储在了二级缓存中[id,username,sex,gender]
        //到二级缓存中根据key(id=1)进行查找,如果存在 - 最先获取的是对象对应的散列的数据 - 底层新建一个User对象,封装这些散列的数据,然后返回
        System.out.println(u1 == u3);//false

        ses.close();
    }
}
