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
public class TestOneLevelCache {
    @Test
    public void testOneLevel(){
        //1. 获取SqlSession = JDBC连接Connection + 一级缓存[默认开启]
        SqlSession sqlSession = MyBatisUtil.getSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //mybatis中的一级缓存是sqlSession级别的 - 生命周期 - sqlSession对象的创建 - sqlSession销毁

        //根据id进行查询
        //1. 发送sql到db - 执行sql
        //2. 将查询出来的结果放入到mybatis默认开启的一级缓存中.
        UserCustomVo user = userMapper.getUserAndOrderByIdLazy(1);
        System.out.println(user);

        System.out.println("===============");
        //清除一级缓存
        //sqlSession.clearCache();

        sqlSession.close();

        //底层key-value   id - 对象
        //发现日志当中并没有再次出现sql语句,并没有和db进行交互
        //优先到一级缓存中进行查询是否存在id=1的对象,如果存在了,直接从一级缓存中获取
        //如果不存在,那么才会和数据库进行交互的操作.
        SqlSession ses = MyBatisUtil.getSession();
        UserMapper um = ses.getMapper(UserMapper.class);
        UserCustomVo user1 = um.getUserAndOrderByIdLazy(1);
        System.out.println(user1);

        System.out.println(user == user1);
        ses.close();
      // sqlSession.close();
    }

    @Test
    public void testOneLevel2(){
        //1. 获取SqlSession = JDBC连接Connection + 一级缓存[默认开启]
        SqlSession sqlSession = MyBatisUtil.getSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //mybatis中的一级缓存是sqlSession级别的 - 生命周期 - sqlSession对象的创建 - sqlSession销毁

        //根据id进行查询
        //1. 发送sql到db - 执行sql
        //2. 将查询出来的结果放入到mybatis默认开启的一级缓存中.
        UserCustomVo user = userMapper.getUserAndOrderByIdLazy(1);
        System.out.println(user);

        //close  clearCache  commit
        sqlSession.commit();//同样会让一级缓存的内容消失.
        //思考?什么时候会使用commit()方法 - DML操作
        //如果执行的是比如根据id=5 查询出来了 - 根据id=5进行更新操作 - dml - commit
        //commit操作清除缓存目的是为了缓存中的数据要和db中的数据同步

        System.out.println("===============");
        //清除一级缓存
        //sqlSession.clearCache();
        UserCustomVo user1 = userMapper.getUserAndOrderByIdLazy(1);
        System.out.println(user1);


        sqlSession.close();

    }
}
