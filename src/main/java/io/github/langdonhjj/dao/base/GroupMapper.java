package io.github.langdonhjj.dao.base;

import io.github.langdonhjj.entity.Group;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HJJ on 16/9/2.
 */
public interface GroupMapper extends BaseMapper<Group,Long> {

    /**
     * 通过ID列出现有组别
     * @param id
     * @return
     */
    List<HashMap<String,Object>> selectByPrimaryKey(@Param("id") long id);

    /**
     * 添加组别
     * @param group
     */
    void addGroup(Group group);

    /**
     * 根据ID删除组
     * @param id
     */
    void deleteByID(@Param("id") long id);

    /**
     * 根据id修改组名
     * @param id
     * @return
     */
    Group updateById(@Param("id") long id);


}
