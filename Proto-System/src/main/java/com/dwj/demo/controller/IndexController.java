package com.dwj.demo.controller;

import com.dwj.demo.common.BackResult;
import com.dwj.demo.common.SystemCode;
import com.dwj.demo.dto.UserDTO;
import com.dwj.demo.entity.User;
import com.dwj.demo.service.UserService;
import com.dwj.demo.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName:IndexController
 * @Description:NULL
 * @Author:weijian.dong
 * @Date:2020/5/18 16:52
 * @Version 1.0
 */

@RestController
@RequestMapping("/index")
@Slf4j
public class IndexController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/getUserInfo")
    public BackResult getUserInfo(){
        try{
            List<UserDTO> result =  userServiceImpl.selectAllUsers();
//            result = null;
            if (result != null)
                return BackResult.getResult(SystemCode.SYSTEM_SUCCESS,"IndexController/getUserInfo 成功执行",result);
            else
                throw new Exception("查无信息，数据库空了");
        }catch(Exception e){
            return BackResult.getResult(SystemCode.SYSTEM_FAIL,"操作执行失败！",e.getMessage());
        }


    }
}
