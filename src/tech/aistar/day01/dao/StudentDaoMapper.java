package tech.aistar.day01.dao;

import tech.aistar.day01.entity.Student;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/8 0008
 */
public interface StudentDaoMapper {

    Student findById(Integer id);
}
