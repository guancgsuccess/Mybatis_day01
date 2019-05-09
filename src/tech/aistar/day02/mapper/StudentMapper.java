package tech.aistar.day02.mapper;

import tech.aistar.day01.entity.Student;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/9 0009
 */
public interface StudentMapper {

    Student findById(Integer id);

}
