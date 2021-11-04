package com.name404.springbootdemo.controller;

import com.name404.springbootdemo.common.enums.ErrorCodeEnum;
import com.name404.springbootdemo.common.enums.OkCodeEnum;
import com.name404.springbootdemo.common.vo.JSONResult;
import com.name404.springbootdemo.model.Obj;
import com.name404.springbootdemo.service.ObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: redisDemo
 * @description:
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 14:18
 **/
@Controller
@RestController
@RequestMapping("/obj")
public class ObjController {

    @Autowired
    ObjService objService;

    @GetMapping("/{id}")
    public JSONResult getById(@PathVariable Long id){
        return JSONResult.ok(objService.getById(id));
    }
    @GetMapping
    public JSONResult findAll(){
        return JSONResult.ok(objService.findAll());
    }
    @PostMapping
    public JSONResult save(@RequestBody Obj obj){
        return JSONResult.ok(objService.save(obj));
    }
    @DeleteMapping("/{id}")
    public JSONResult deleteById(@PathVariable Long id){
        try{
            objService.deleteById(id);
        }catch (Exception e){
            return JSONResult.errorMap(ErrorCodeEnum.DELETE_ERROR);
        }
        return JSONResult.ok(OkCodeEnum.Operate_successfully);
    }
    @DeleteMapping
    public JSONResult deleteAllById(@RequestBody List<Long> idList){
        objService.deleteAllById(idList);
        return JSONResult.ok(OkCodeEnum.Operate_successfully);
    }
}
