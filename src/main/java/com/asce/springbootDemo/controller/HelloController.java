package com.asce.springbootDemo.controller;

import com.asce.springbootDemo.controller.req.InsertReq;
import com.asce.springbootDemo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("world") String str){
        return str;
    }


    public static void main(String[] args){

    }

}
