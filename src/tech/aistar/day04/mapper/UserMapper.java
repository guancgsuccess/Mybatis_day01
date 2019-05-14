package tech.aistar.day04.mapper;

import tech.aistar.day04.vo.UserCustomVo;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public interface UserMapper {

    /**
     * 级联查询出该用户的所有的信息
     * @param id
     * @return
     */
    UserCustomVo findById(Integer id);
}
