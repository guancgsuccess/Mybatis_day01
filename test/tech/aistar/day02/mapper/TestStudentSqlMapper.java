package tech.aistar.day02.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import tech.aistar.day01.entity.vo.StudentQueryVo;
import tech.aistar.util.MyBatisUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
@SuppressWarnings("all")
public class TestStudentSqlMapper {
    @Test
    public void testFindById(){
//        SqlSession sqlSession = MyBatisUtil.getSession();
//
//        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);
//
//        List<Student> list = mapper.findByIdorSnameAno(100015,"%o%");
//
//        list.forEach(System.out::println);

        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);

        StudentQueryVo vo = new StudentQueryVo();
        Student s = new Student();
        s.setId(100015);
        s.setSname("o");
        vo.setStudent(s);
        List<Student> list = mapper.findByIdorSnameVo(vo);

        list.forEach(System.out::println);
    }

    @Test
    public void testFindAllByAnyConditional(){
        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);

        List<Student> list = mapper.findAllByAnyConditional(100015,"o");

        list.forEach(System.out::println);
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);

        Student s = mapper.getById(100015);

        s.setSname("t7");

        s.setBirthday(null);

        mapper.update(s);

        sqlSession.commit();

    }

    @Test
    public void testFindAllByFirstConditional(){
        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);

        List<Student> list = mapper.findAllByFirstConditional(null,null);

        list.forEach(System.out::println);
    }

    @Test
    public void testFindByIds(){
        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);

        List<Integer> ids = new ArrayList<>();
        ids.add(100015);
        ids.add(100014);
        ids.add(100016);

        List<Student> list = mapper.findByIds(ids);

        list.forEach(System.out::println);
    }
    @Test
    public void testSaveList(){
        SqlSession sqlSession = MyBatisUtil.getSession();

        StudentSqlMapper mapper = sqlSession.getMapper(StudentSqlMapper.class);


        Student s1 = new Student();
        s1.setSno("300015");
        s1.setSname("好老詹");
        s1.setBirthday(new Date());


        Student s2 = new Student();
        s2.setSno("300016");
        s2.setSname("老詹好");
        s2.setBirthday(new Date());

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        mapper.saveList(list);

        sqlSession.commit();
    }



}
