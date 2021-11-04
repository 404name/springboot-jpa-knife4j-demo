package com.name404.springbootdemo.controller;

import com.name404.springbootdemo.common.enums.ErrorCodeEnum;
import com.name404.springbootdemo.common.enums.OkCodeEnum;
import com.name404.springbootdemo.common.vo.JSONResult;
import com.name404.springbootdemo.model.Obj;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: SpringbootDemo
 * @description: 用于快速给其他Controller构建框架用，实际是实现完就删
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 16:25
 **/
public interface BaseController {
    @GetMapping("/{id}")
    public JSONResult getById(@PathVariable Long id);
    @GetMapping
    public JSONResult findAll();
    @PostMapping
    public JSONResult save(@RequestBody Obj obj);
    @DeleteMapping("/{id}")
    public JSONResult deleteById(@PathVariable Long id);
    @DeleteMapping
    public JSONResult deleteAllById(@RequestBody List<Long> idList);
}
