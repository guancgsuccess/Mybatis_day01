package tech.aistar.day01.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import tech.aistar.day01.dao.StudentDaoMapper;
import tech.aistar.day01.entity.Student;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public class StudentDaoMapperImpl implements StudentDaoMapper{

    private SqlSessionFactory sqlSessionFactory;

    //需要注入以一个SessionFactory
    public StudentDaoMapperImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Student findById(Integer id) {
        //获取session对象
        SqlSession sqlSession = null;
        Student s = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            s = sqlSession.selectOne("success.find",id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null!=sqlSession){
                sqlSession.close();
            }
        }
        return s;
    }

    @Override
    public List<Student> findByLike(String sname) {
        return null;
    }

    @Override
    public void delById(Integer id) {

    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student studnet) {

    }
}
