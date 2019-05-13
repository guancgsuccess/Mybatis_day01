package tech.aistar.day02.mapper;

import tech.aistar.day01.entity.Student;
import tech.aistar.day01.entity.vo.StudentQueryVo;

import java.util.List;

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

}
