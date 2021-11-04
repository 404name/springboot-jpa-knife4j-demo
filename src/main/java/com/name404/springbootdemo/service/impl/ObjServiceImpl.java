package com.name404.springbootdemo.service.impl;

import com.name404.springbootdemo.dao.ObjDao;
import com.name404.springbootdemo.model.Obj;
import com.name404.springbootdemo.service.ObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: redisDemo
 * @description:
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 13:11
 **/
@Service
public class ObjServiceImpl implements ObjService{
    @Autowired
    ObjDao objDao;

    @Override
    public List<Obj> saveAll(List<Obj> objList) {
        return objDao.saveAll(objList);
    }

    @Override
    public Obj save(Obj obj) {
        return objDao.save(obj);
    }

    @Override
    public void deleteById(Long id) {
        objDao.deleteById(id);
    }

    @Override
    public void deleteAllById(List<Long> idList) {
        objDao.deleteAllById(idList);
    }

    @Override
    public Obj getById(Long id) {
        return objDao.getById(id);
    }

    @Override
    public List<Obj> findAll() {
        return objDao.findAll();
    }
}
