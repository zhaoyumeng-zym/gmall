package com.zhaoyumeng.gmall.user.controller;

import com.zhaoyumeng.gmall.bean.UmsMember;
import com.zhaoyumeng.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhaoyumeng
 * @date 2020/2/19 - 12:11
 * @Program name
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
