package com.wsd.controller;

import com.wsd.model.User;
import com.wsd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tm on 2018/7/19.
 * controller类
 */
@Controller
@RequestMapping("/userInfo")
public class UserController {

    @Autowired UserService us;

    @RequestMapping
    public String getUser(){
        return "userInfo";
    }
}
