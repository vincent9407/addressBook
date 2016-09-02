package io.github.langdonhjj.dao;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import io.github.langdonhjj.dao.base.BaseMapper;
import io.github.langdonhjj.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HJJ on 16/8/24.
 */
public interface UsersMapper extends BaseMapper<Users,Long> {

    /**
     * 通过ID列出用户信息
     * @param id
     * @return
     */
    List<HashMap<String,Object>> selectByPrimaryKey(@Param("id") long id);

    /**
     *根据姓名查询
     * @param name
     * @return
     */
    Users findByName(@Param("name") String name);

    /**
     * 根据ID删除信息
     * @param id
     */
    void deleteById(@Param("id") long id);

    /**
     * 根据ID修改信息
     * @param id
     * @return
     */
    Users updateById(@Param("id") long id);

    /**
     * 通过电话号码查询信息
     * @param phonenumber
     * @return
     */
    Users findByPhoneNumber(@Param("phonenumber") String phonenumber);

    /**
     *通过组别查找
     * @param groupname
     * @return
     */
    Users findByGroupName(@Param("groupname") String groupname);


    /**
     * 添加用户
     * @param users
     */
    void addUser(Users users);
}
