package com.name404.springbootdemo.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.name404.springbootdemo.common.vo.JSONResult;
import com.name404.springbootdemo.model.Obj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SpringbootDemo
 * @description: 可以快速基于BaseController接口实现方法模板，然后删了再写
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 16:26
 **/
@RestController
@RequestMapping("/obj")
public class TestController implements BaseController {
    @Override
    public JSONResult getById(Long id) {
        return null;
    }

    @Override
    public JSONResult findAll() {
        return null;
    }

    @Override
    public JSONResult save(Obj obj) {
        return null;
    }

    @Override
    public JSONResult deleteById(Long id) {
        return null;
    }

    @Override
    public JSONResult deleteAllById(List<Long> idList) {
        return null;
    }
}
