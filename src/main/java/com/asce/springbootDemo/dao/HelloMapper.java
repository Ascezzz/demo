package com.asce.springbootDemo.dao;

import com.asce.springbootDemo.controller.req.InsertReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {

    void insertUser(InsertReq insertReq);

}
