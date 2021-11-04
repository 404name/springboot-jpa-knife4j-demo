package com.name404.springbootdemo.controller;

import com.name404.springbootdemo.common.vo.JSONResult;
import com.name404.springbootdemo.model.Obj;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: redisDemo
 * @description:
 * @author: CTGU_LLZ(404name)
 * @create: 2021-11-04 15:06
 *
 * @BeforeAll : 只执行一次，执行时机是在所有测试和 @BeforeEach 注解方法之前。
 * @BeforeEach:在每个测试执行之前执行。
 * @AfterEach :在每个测试执行之后执行。
 * @AfterAll: 只执行一次，执行时机是在所有测试和 @AfterEach 注解方法之后。
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
class ObjControllerTest {
    private static Logger logger = LoggerFactory.getLogger(ObjControllerTest.class);
    @Autowired
    private ObjController objController;


    @Test
    void save() {
        Obj obj = new Obj();
        obj.setId((long) 1);
        obj.setContent("我是文章内容");
        obj.setHeadImg("我是图片");
        logger.info("-------创建对象obj : {}",obj);
        JSONResult save = objController.save(obj);
        logger.info("-------创建完成obj : {}",save);
    }

    @Test
    void getById() {
        logger.info("-------获取ID为1的对象");
        JSONResult byId = objController.getById((long) 1);
        logger.info("-------获取成功obj : {}",byId);
    }

    @Test
    void findAll() {
        logger.info("-------获取所有对象 : {}",objController.findAll());
    }



    @Ignore //忽略
    void deleteById() {
        logger.info("我是被忽略的，理论上看不到我");
    }

    @Test
    void deleteAllById() {
    }
}