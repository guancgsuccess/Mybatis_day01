package tech.aistar.day01.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import tech.aistar.day01.dao.StudentDaoMapper;
import tech.aistar.day01.entity.Student;
import tech.aistar.util.MyBatisUtil;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public class StudentDaoImpl implements StudentDaoMapper{

    @Override
    public Student findById(Integer id) {
         SqlSession sqlSession = MyBatisUtil.getSession();

         Student s = sqlSession.selectOne("success.find",id);

         sqlSession.close();

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
