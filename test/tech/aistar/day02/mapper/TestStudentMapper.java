package tech.aistar.day02.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import tech.aistar.util.MyBatisUtil;
import tech.aistar.day01.entity.vo.StudentQueryVo;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public class TestStudentMapper {
    @Test
    public void testFindById(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        //获取到一个Mapper接口的实现类的一个代理对象
        //动态代理 - 在程序的运行的过程中生成mapper接口的实现类的代理对象

        //使用场景 - 除本核心业务以外还存在一些其他的业务.

        //原先使用sqlSession对象调用insert update delete selectOne  selectList - 就是底层的调用方式
        //除了调用这些api方法,还需要动态创建出mapper接口的实现类

        //调用映射文件中的sql语句的时候
        //1. 无需硬编码调用sql
        //2. 参数类型安全了
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student s = mapper.findById(5);

        System.out.println(s);
    }
    @Test
    public void testFindByIdAndSname(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        //1.获取mapper代理对象
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        StudentQueryVo queryVo = new StudentQueryVo();
        Student s = new Student();
        s.setId(100015);
        s.setSname("%o%");

        queryVo.setStudent(s);

        List<Student> studentList = mapper.findByIdorSname(queryVo);

        studentList.forEach(System.out::println);

        sqlSession.close();
    }
}
