package com.asce.springbootDemo.controller.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class InsertReq implements Serializable {
    private static final long serialVersionUID = 6168754315862496724L;

    private String userName;

    private String account;

    private String password;

}
