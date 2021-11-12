package com.asce.springbootDemo.service.impl;

import com.asce.springbootDemo.controller.req.InsertReq;
import com.asce.springbootDemo.dao.HelloMapper;
import com.asce.springbootDemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public void insert(InsertReq insertReq) {
        helloMapper.insertUser(insertReq);
    }
}
