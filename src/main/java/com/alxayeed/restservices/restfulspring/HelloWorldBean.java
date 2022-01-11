package com.alxayeed.restservices.restfulspring;

public class HelloWorldBean {

    private final String msg;

    public HelloWorldBean(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
