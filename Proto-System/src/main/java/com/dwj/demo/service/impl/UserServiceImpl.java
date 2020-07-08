package com.dwj.demo.service.impl;

import com.dwj.demo.dao.UserMapper;
import com.dwj.demo.dto.UserDTO;
import com.dwj.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName:UserServiceImpl
 * @Description:NULL
 * @Author:weijian.dong
 * @Date:2020/5/18 16:59
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<UserDTO> selectAllUsers() {
        return userMapper.selectAllUser();
    }

}
