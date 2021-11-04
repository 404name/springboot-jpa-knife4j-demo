package com.name404.springbootdemo.dao;

import com.name404.springbootdemo.model.Obj;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: redisDemo
 * @description:
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 13:06
 **/
public interface ObjDao extends JpaRepository<Obj, Long> {
    Obj findByArticleName(String name);
}
