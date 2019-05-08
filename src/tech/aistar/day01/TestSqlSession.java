package tech.aistar.day01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:读取配置文件,最终目的是为了SqlSession
 * @date 2019/5/8 0008
 */
public class TestSqlSession {
    public static void main(String[] args) {
        //1.获取mybatis-config.xml的字节输入流
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            System.out.println(in);

            //2.通过SqlSessionFactoryBuilder对象来读取这个配置文件,帮助我们构建出
            //SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

            System.out.println(sqlSessionFactory);

            //SqlSessionFactory - 相当于是一个"数据源",它是一个"重量级"的对象.
            //创建它和销毁它的成本比较高,相当占有系统资源.应该要保证它在应用是单例的.
            //每个SqlSessionFactory对象都应该对应一个数据库.
            //作用:负责构建出SqlSession对象

            //SqlSession相当于JDBC中的Connection,代表的是一次连接
            //它是线程非安全的 - 每个请求对应唯一的SqlSession
            //提供了对DB基本的一些CRUD操作.
            SqlSession sqlSession = sqlSessionFactory.openSession();

            System.out.println(sqlSession);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
