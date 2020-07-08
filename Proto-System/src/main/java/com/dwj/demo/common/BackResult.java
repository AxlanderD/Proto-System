package com.dwj.demo.common;

import lombok.Data;

/**
 * @ClassName:BackResult
 * @Description:NULL
 * @Author:weijian.dong
 * @Date:2020/5/18 17:32
 * @Version 1.0
 */
@Data
public class BackResult {
    private SystemCode systemResponse;
    private String backMsg;
    private Object backObj;

    BackResult(){}

    BackResult(SystemCode code,String backMsg){
        this.systemResponse = code;
        this.backMsg = backMsg;
    }

    BackResult(SystemCode code,String backMsg,Object backObj){
        this.systemResponse = code;
        this.backMsg = backMsg;
        this.backObj = backObj;
    }

    public static BackResult getResult(SystemCode code,String backMsg){
        return new BackResult(code,backMsg,null);
    }

    public static BackResult getResult(SystemCode code,String backMsg,Object backObj){
        return new BackResult(code,backMsg,backObj);
    }


}
