package com.name404.springbootdemo.service;

import java.util.List;

public interface BaseService<T>{
    /**
     * 更新/新增
     *
     * @param obj
     * @return
     */
    T save(T obj);
    /**
     * 批量添加
     *
     * @param objList
     * @return
     */
    List<T> saveAll(List<T> objList);

    /**
     * 根据id删除
     */
    void deleteById(Long id);

    /**
     * 批量删除
     *
     * @param idList
     * @return
     */
    void deleteAllById(List<Long> idList);


    /**
     * 根据id查找
     */
    T getById(Long id);
    /**
     * 查询所有
     */
    List<T> findAll();
}