package io.github.langdonhjj.dao.base;

import java.io.Serializable;

/**
 * Created by HJJ on 16/8/31.
 * 创建基础类
 */
public interface BaseMapper<T,ID extends Serializable> {

    /**
     * 根据ID删除记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(ID id);

    /**
     * 保存实体
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 保存实体不为空的属性
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 根据ID查找实体
     * @param id
     * @return
     */
    T selectByPrimaryKey(ID id);


    /**
     * 根据ID更新不为空的实体
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);


    /**
     * 根据ID更新实体
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}

