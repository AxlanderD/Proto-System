package com.dwj.demo.service;

import com.dwj.demo.dto.UserDTO;

import java.util.List;

/**
 * @ClassName:userService
 * @Description:NULL
 * @Author:weijian.dong
 * @Date:2020/5/18 16:53
 * @Version 1.0
 */
public interface UserService {
    List<UserDTO> selectAllUsers();
}
