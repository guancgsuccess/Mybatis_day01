package tech.aistar.day02.mapper;

import org.apache.ibatis.annotations.Param;
import tech.aistar.day01.entity.Student;
import tech.aistar.day01.entity.vo.StudentQueryVo;

import java.util.List;
import java.util.Map;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public interface StudentMapper {

    Student findById(Integer id);

    /**
     * 多重组合条件查询使用到多个参数的时候
     * 方式一:使用第三方实体类
     * @param queryVo
     * @return
     */
    List<Student> findByIdorSname(StudentQueryVo queryVo);

    /**
     * 多重组合条件查询使用到多个参数的时候
     * 第二种方式:采用参数注解的方式
     * @param id
     * @param sname
     * @return
     */
    List<Student> findByIdorSnameAno(@Param("pid") Integer id, @Param("pname") String sname);

    /**
     * 多重组合条件查询使用到多个参数的时候
     * 方式三:使用Map
     * 将查询条件封装到map集合中去.
     * @param map
     * @return
     */
    List<Student> findByIdorSnameMap(Map<String,Object> map);


}
