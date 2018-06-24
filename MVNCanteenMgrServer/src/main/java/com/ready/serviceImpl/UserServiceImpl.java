package com.ready.serviceImpl;

import com.ready.dao.UserInfoMapper;
import com.ready.pojo.UserInfo;
import com.ready.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 用户相关的service接口实现
 * @create: 2018-06-14 12:43
 */

@Service
@Qualifier("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    //添加用户
    @Override
    public void addUser(UserInfo user) {
        userInfoMapper.insert(user);
    }

    //通过用户名查询用户
    @Override
    public UserInfo findOneByName(String username) {
        return userInfoMapper.findOneByName(username);
    }

    //查询所有用户
    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    //删除用户
    @Override
    public void deleteUser(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    //更新用户信息
    @Override
    public void updateUser(UserInfo findUser) {
        userInfoMapper.updateByPrimaryKey(findUser);
    }

    //查询用户
    @Override
    public UserInfo findOne(String account, String password) {
        return userInfoMapper.selectByInfo(account, password);
    }

    public UserInfo findOne(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
