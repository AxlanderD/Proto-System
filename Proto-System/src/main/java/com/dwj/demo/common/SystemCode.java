package com.dwj.demo.common;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @ClassName:SystemCode
 * @Description:NULL
 * @Author:weijian.dong
 * @Date:2020/5/18 17:33
 * @Version 1.0
 */
public enum SystemCode {
    SYSTEM_FAIL("404"),
    SYSTEM_SUCCESS("200");


    private String msg;
    SystemCode(String msg){
         this.msg = msg;
    }

    public String getMsg(){
        return this.msg;
    }
}
