package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;
import java.util.Objects;

@RestController
public class MyGetMethod {

    @RequestMapping(value="/getCookies",method = RequestMethod.GET)
    public String  getCookies(HttpServletResponse response){

        //HttpServletRequest 装请求消息的类
        //HttpServletResponse 装响应信息的类
        Cookie cookie=new Cookie("login","ture");
        response.addCookie(cookie);
        return "恭喜你获得Cookies信息成功";
    }
    @RequestMapping(value="/get/with/cookies",method=RequestMethod.GET)
    public String getWithCookies(HttpServletRequest httpServletRequest){

        Cookie[] cookies=httpServletRequest.getCookies();
        if(Objects.isNull(cookies)){
            return "没有带cookies";
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "这是一个需要携带cookies信息才能访问的get请求";
            }
        }
        return "必须携带cookies";
    }

}
