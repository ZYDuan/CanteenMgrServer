package com.ready.controller;

import com.ready.common.CommonResponse;
import com.ready.pojo.UserInfo;
import com.ready.service.UserService;
import com.ready.util.CodeUtil;
import com.ready.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;


/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 用户相关的controller
 * @create: 2018-06-14 12:43
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userServiceImpl;

    @RequestMapping("/login")
    @ResponseBody
    public CommonResponse userLogin(@RequestBody HashMap<String, String> info, HttpServletResponse httpResponse) {
        CommonResponse response = new CommonResponse();

        if (!info.get("username").isEmpty() && !info.get("password").isEmpty()) {
            UserInfo userInfo = userServiceImpl.findOne(info.get("username"), info.get("password"));
            if (userInfo != null) {
                response.setStatus(CodeUtil.SUCCESS_CODE);
                response.setMsg(CodeUtil.SUCCESS_MSG);

                // 把用户信息生成token放进session
                // 设置token存活时间
                long livingTime = 1000 * 60 * 60 * 24 * 7;

                // 生成token并放于session中
                String sessionId = JWTUtil.createJWT(String.valueOf(userInfo.getUserId()), "READY", livingTime);
                httpResponse.addHeader("token", sessionId);
                System.out.println(sessionId);
                return response;
            }
        } else {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg(CodeUtil.REQUEST_FAIL);

        }

        return response;
    }

    //添加用户
    @RequestMapping("/userRegister")
    @ResponseBody
    public CommonResponse userRegister(@RequestBody HashMap<String, String> user) {
        CommonResponse response = new CommonResponse();
        UserInfo userInfo = new UserInfo();
        if (!user.get("username").isEmpty() && !user.get("password").isEmpty()) {
            if (userServiceImpl.findOneByName(user.get("username")) == null) {
                userInfo.setUserAccount(user.get("username"));
                userInfo.setUserPassword(user.get("password"));
                userServiceImpl.addUser(userInfo);
                response.setStatus(CodeUtil.SUCCESS_CODE);
                response.setMsg(CodeUtil.SUCCESS_MSG);
                return response;
            } else {
                response.setStatus(CodeUtil.FAILE_CODE);
                response.setMsg("已有相同的用户名");
            }

        } else {
            response.setStatus(CodeUtil.FAILE_CODE);
            response.setMsg(CodeUtil.FAILE_MSG);
        }
        return response;
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public CommonResponse getAllUser() {
        CommonResponse response = new CommonResponse();
        List<UserInfo> userInfo = userServiceImpl.findAll();
        response.setMsg(CodeUtil.SUCCESS_MSG);
        response.setData(userInfo);
        response.setStatus(CodeUtil.SUCCESS_CODE);
        return response;
    }

    //删除用户
    @RequestMapping("/deleteUser")
    @ResponseBody
    public CommonResponse deleteUser(@RequestParam(value = "userId", required = true) Integer id) {
        //判断是否存在该用户
        if (userServiceImpl.findOne(id) != null) {
            userServiceImpl.deleteUser(id);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        } else {
            return new CommonResponse(CodeUtil.FAILE_CODE, "用户已被删除");
        }

    }

    //修改用户信息
    @RequestMapping("/updateUser")
    @ResponseBody
    public CommonResponse updateUser(@RequestBody UserInfo userInfo) {
        UserInfo findUser = userServiceImpl.findOne(userInfo.getUserId());
        //判断是否存在该用户
        if (findUser != null) {
            findUser.setUserAccount(userInfo.getUserAccount());
            findUser.setUserPassword(userInfo.getUserPassword());
            userServiceImpl.updateUser(findUser);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        }else {
            return new CommonResponse(CodeUtil.FAILE_CODE, "该用户不存在");
        }

    }
}
