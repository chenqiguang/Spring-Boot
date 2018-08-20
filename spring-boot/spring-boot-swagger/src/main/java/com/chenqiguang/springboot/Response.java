// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Response.java

package com.chenqiguang.springboot;


public class Response<T> {
    public static final Integer OK = Integer.valueOf(1);
    public static final Integer Fail = Integer.valueOf(-1);
    private Integer code;
    private String message;
    private T result;

    public Response() {
    }

    public static Response ok(String message)
    {
        Response response = new Response();
        response.setCode(OK);
        response.setMessage(message);
        return response;
    }

    public static Response failed(String message)
    {
        Response response = new Response();
        response.setCode(Fail);
        response.setMessage(message);
        return response;
    }

    public static Response from(Integer code, String message)
    {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static Response from(Integer code, String message, Object result)
    {
        Response response = new Response();
        response.setCode(code);
        response.setMessage(message);
        response.setResult(result);
        return response;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getResult()
    {
        return result;
    }

    public void setResult(T result)
    {
        this.result = result;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Response{code=").append(code).append(", message='").append(message).append('\'').append(", result=").append(result).append('}').toString();
    }


}
