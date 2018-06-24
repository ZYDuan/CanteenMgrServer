package com.ready.dao;

import com.ready.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByInfo(@Param("account") String account, @Param("password") String password);

    UserInfo findOneByName(@Param("account")String account);
}