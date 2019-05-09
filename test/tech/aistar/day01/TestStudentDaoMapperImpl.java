package tech.aistar.day01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import tech.aistar.day01.entity.Student;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/8 0008
 */
public class TestStudentDaoMapperImpl {

    @Test
    public void testFindById(){
        //1.获取mybatis-config.xml的字节输入流
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

            SqlSession sqlSession = sqlSessionFactory.openSession();

            //因为查询的是返回的单个对象
            //selectOne(mapper的xml文件的namespace.某个标签的id的值)
            //Student s = sqlSession.selectOne("tech.aistar.day01.dao.StudentDaoMapperImpl.findById",5);
            Student s = sqlSession.selectOne("success.find",5);

            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
