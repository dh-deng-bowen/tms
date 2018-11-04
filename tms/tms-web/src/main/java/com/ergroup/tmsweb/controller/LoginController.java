package com.ergroup.tmsweb.controller;

import com.ergroup.tmsweb.entity.Message;
import com.ergroup.tmsweb.session.SessionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value = "login")
    public String login() {

        return "login";
    }

    @PostMapping("login/login.do")
    @ResponseBody
    public Message login(String userName, String password, HttpServletRequest request) {

        if("bowen".equals(userName) && "123456".equals(password)) {

            SessionUtil.setSession(userName);
            return Message.success();
        }

        return Message.fail("账号密码错误");
    }
}
