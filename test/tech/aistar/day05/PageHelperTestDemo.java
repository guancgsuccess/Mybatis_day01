package tech.aistar.day05;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import tech.aistar.day01.entity.Student;
import tech.aistar.day02.mapper.StudentMapper;
import tech.aistar.util.MyBatisUtil;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/15 0015
 */
public class PageHelperTestDemo {
    @Test
    public void testPage(){
        StudentMapper mapper = MyBatisUtil.getSession().getMapper(StudentMapper.class);

        PageHelper.startPage(2,5);//第二页,每页显示三条

        List<Student> list = mapper.findAll();

        PageInfo<Student> pageInfo = new PageInfo<>(list);

        System.out.println("当前页:"+pageInfo.getPageNum());
        System.out.println("总页:"+pageInfo.getPages());
        System.out.println("总的条数:"+pageInfo.getTotal());
        System.out.println("每页显示条数:"+pageInfo.getPageSize());
        System.out.println("显示的内容:");
        pageInfo.getList().forEach(System.out::println);
    }
}
