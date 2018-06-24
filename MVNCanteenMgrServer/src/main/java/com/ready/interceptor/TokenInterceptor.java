package com.ready.interceptor;

import com.ready.common.CommonResponse;
import com.ready.util.CheckResult;
import com.ready.util.CodeUtil;
import com.ready.util.JWTUtil;
import com.ready.util.JsonUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String url = request.getRequestURI();
        if (url.indexOf("login") >= 0 || url.indexOf("register") >= 0 || url.indexOf("Register") > 0 ) {
            return true;
        }
        response.setContentType("text/html;charset=utf-8");


        String token = request.getHeader("token");
        System.out.println(token);
        // 发送请求无token
        if (token == null || token.isEmpty()) {
            CommonResponse responseData = new CommonResponse(CodeUtil.FAILE_CODE, "身份验证失败");
            String res = JsonUtil.parseToJson(responseData);
            response.getWriter().append(res).flush();
            return false;
        }

        // 验证token
        CheckResult checkResult = JWTUtil.verifyJWT(token);

        int code = checkResult.getCheckCode();
        if (code == CodeUtil.JWT_SUCCESS) {
            System.out.println(checkResult.getChaims().getSubject());
            System.out.println(checkResult.getChaims().getId());
            System.out.println(checkResult.getChaims().get("userId"));
            System.out.println(checkResult.getChaims().getExpiration());
            return true;
        } else if (code == CodeUtil.JWT_ERRCODE_EXPIRE || code == CodeUtil.JWT_ERRCODE_FAIL) {
            CommonResponse responseData = new CommonResponse(CodeUtil.FAILE_CODE, "身份验证失败");
            String res = JsonUtil.parseToJson(responseData);
            response.getWriter().append(res).flush();
            return false;
        }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
