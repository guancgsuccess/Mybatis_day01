package tech.aistar.day02.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    @Select("select * from db_student where id = #{id}")
    Student getById(Integer id);

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

    /**
     * 更新一个学生信息
     * @param s
     */
    void update(Student s);

    /**
     * 如果传入了id,那么就只会执行id条件查询.如果没有传入id,那么会根据sname来进行查询
     * @param id
     * @param sname
     * @return
     */
    List<Student> findAllByFirstConditional(@Param("id")Integer id,@Param("sname")String sname);

    /**
     * select * from db_student where (id = ? or id = ? or id = ?)
     * 比如查询id = 100015 or id=100014 or id=100013
     * @param ids
     * @return
     */
    List<Student> findByIds(@Param("ids") List<Integer> ids);

    /**
     * 保存多个学生信息使用的是一条sql语句完成
     * insert into t_husband(name) values('王静静'),('小P霞'),('生蚝');
     * @param students
     */
    void saveList(@Param("students") List<Student> students);
}
