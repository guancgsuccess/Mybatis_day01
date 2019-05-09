package tech.aistar.day01.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import tech.aistar.day01.dao.impl.StudentDaoImpl;
import tech.aistar.day01.dao.impl.StudentDaoMapperImpl;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public class TestStudentDaoImpl {

    private StudentDaoMapper dao = new StudentDaoImpl();


    @Test
    public void testFindById(){
        System.out.println(dao.findById(5));
    }
}
