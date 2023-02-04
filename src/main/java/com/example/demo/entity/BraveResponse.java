package com.example.demo.entity;

import lombok.Data;

@Data
public class BraveResponse {


    private boolean ok;  //请求是否处理成功
    private int code; //请求响应状态码（200、400、500）
    private String message;  //请求结果描述信息
    private Object data; //请求结果数据（通常用于查询操作）

    private BraveResponse(){}

    //请求成功的响应，不带查询数据（用于删除、修改、新增接口）
    public static BraveResponse success(){
        BraveResponse ajaxResponse = new BraveResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        return ajaxResponse;
    }

    //请求成功的响应，带有查询数据（用于数据查询接口）
    public static BraveResponse success(Object obj){
        BraveResponse ajaxResponse = new BraveResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    //请求成功的响应，带有查询数据（用于数据查询接口）
    public static BraveResponse success(Object obj, String message){
        BraveResponse ajaxResponse = new BraveResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }


}
