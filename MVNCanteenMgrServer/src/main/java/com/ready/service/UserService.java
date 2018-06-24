package com.ready.service;

import com.ready.pojo.UserInfo;

import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 用户相关的service接口
 * @create: 2018-06-14 12:43
 */


public interface UserService {

    //查询用户
    UserInfo findOne(String account, String password);

    UserInfo findOne(Integer id);

    //添加用户
    void addUser(UserInfo user);

    //    查询是否已有该用户名的用户
    UserInfo findOneByName(String username);

    //    获取所有用户信息
    List<UserInfo> findAll();

    //    删除用户
    void deleteUser(Integer id);

    //更新用户信息
    void updateUser(UserInfo findUser);
}
