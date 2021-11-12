package com.asce.springbootDemo.controller;

import com.asce.springbootDemo.controller.req.InsertReq;
import com.asce.springbootDemo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        int i = 0;
        log.info("int:{}",i);
        return "world";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insert(@RequestBody InsertReq insertReq){
        log.info("insertReq:{}",insertReq);
        try {
            helloService.insert(insertReq);
            return "success";
        }catch (Exception e){
            log.error("insert.error:",e);
            return "error";
        }

    }

}
