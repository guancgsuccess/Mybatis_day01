package tech.aistar.day02.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import tech.aistar.day01.entity.vo.StudentQueryVo;
import tech.aistar.util.MyBatisUtil;

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

}
