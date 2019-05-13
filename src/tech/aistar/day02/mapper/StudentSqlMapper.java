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
public interface StudentSqlMapper {

    /**
     * 如果没有传入sname的话,那么就仅仅根据id进行查询,如果传入了sname,那么继续根据sname进行模糊查询.
     * @param id
     * @param sname
     * @return
     */
    List<Student> findByIdorSnameAno(@Param("id") Integer id, @Param("sname") String sname);

    List<Student> findByIdorSnameVo(StudentQueryVo queryVo);

    /**
     * 如果id和sname都没有传入,那么则查询所有的,如果传入了什么条件,那么就根据什么条件来进行查询.
     * @param id
     * @param sname
     * @return
     */
    List<Student> findAllByAnyConditional(@Param("id")Integer id,@Param("sname")String sname);
}
