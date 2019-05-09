package tech.aistar.day01.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import tech.aistar.day01.dao.impl.StudentDaoImpl;
import tech.aistar.day01.dao.impl.StudentDaoMapperImpl;
import tech.aistar.day01.entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

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

    @Test
    public void testSave(){
        Student s = new Student();
        s.setSno("1013");
        s.setSname("老詹秃头");
        s.setBirthday(new Date());
        dao.save(s);
    }

    @Test
    public void testDel(){
        dao.delById(200018);
    }

    @Test
    public void testUpdate(){
        //1. 自己new一个 - >保证对象的id在数据库中要有记录

        //2.推荐是先根据id获取
        Student s = dao.findById(200015);


        s.setSno("8888");

        s.setSname("码云");

        dao.update(s);
    }

}
