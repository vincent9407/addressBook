package io.github.langdonhjj.dao;

import io.github.langdonhjj.entity.Users;

import java.util.List;

/**
 * Created by HJJ on 16/8/24.
 */
public interface UsersMapper {

    int insert(Users record);

    List<Users> selectAll();

    Users load(Integer id);

    int updateById(Integer id);

    int delectById(Integer id);

}
