package tech.aistar.day02.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tech.aistar.day01.entity.Student;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:mybatis注解开发 - 不推荐使用
 * @date 2019/5/13 0013
 */
public interface StudentMapperAno {

    @Select("select * from db_student where id = #{id}")
    Student getById(Integer id);

    @Insert("insert into db_student(sno,sname,birthday) values(#{sno},#{sname},#{birthday})")
    void save(Student s);

    @Select("select id _id,sno,sname name,birthday from db_student")
    @Results({
            @Result(id = true,column = "_id",property = "id"),
            @Result(column = "name",property="sname")
    })
    List<Student> findAll();
}
